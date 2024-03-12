import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelViewer extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private File selectedFile;

    public ExcelViewer() {
        setTitle("Excel Viewer and Editor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        selectedFile = new File("C:\\Users\\prato\\Desktop\\Book1.xlsx");

        // Initialize the table before calling displayExcel
        table = new JTable();
        table.setDefaultEditor(Object.class, new DefaultCellEditor(new JTextField()));
        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        displayExcel(selectedFile);

        JButton saveButton = new JButton("Save Changes");
        saveButton.addActionListener(e -> {
            if (selectedFile != null && model != null) {
                saveExcel(selectedFile);
            } else {
                JOptionPane.showMessageDialog(null, "No Excel file is opened.");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        getContentPane().add(buttonPanel, BorderLayout.NORTH);

        // Set Excel-like styling for the table
//        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Disable auto resizing
        table.setGridColor(Color.gray); // Set grid color
        table.getTableHeader().setFont(table.getFont().deriveFont(Font.BOLD)); // Bold font for table header
        table.setDefaultRenderer(Object.class, new ExcelStyleCellRenderer()); // Custom cell renderer
    }

    private void displayExcel(File file) {
        try (FileInputStream inputStream = new FileInputStream(file);
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter dataFormatter = new DataFormatter();
            model = new DefaultTableModel();

            Row headerRow = sheet.getRow(0);
            if (headerRow != null) {
                for (Cell cell : headerRow) {
                    model.addColumn(dataFormatter.formatCellValue(cell));
                }

                for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                    Row row = sheet.getRow(rowIndex);
                    if (row != null) {
                        Object[] rowData = new Object[headerRow.getLastCellNum()];
                        for (int columnIndex = 0; columnIndex < headerRow.getLastCellNum(); columnIndex++) {
                            Cell cell = row.getCell(columnIndex);
                            rowData[columnIndex] = dataFormatter.formatCellValue(cell);
                        }
                        model.addRow(rowData);
                    }
                }
            }

            table.setModel(model);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveExcel(File file) {
        try (FileInputStream inputStream = new FileInputStream(file);
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (int rowIndex = 0; rowIndex < model.getRowCount(); rowIndex++) {
                Row row = sheet.getRow(rowIndex + 1);
                if (row == null) {
                    row = sheet.createRow(rowIndex + 1);
                }
                for (int columnIndex = 0; columnIndex < model.getColumnCount(); columnIndex++) {
                    Object value = model.getValueAt(rowIndex, columnIndex);
                    Cell cell = row.getCell(columnIndex);
                    if (cell == null) {
                        cell = row.createCell(columnIndex);
                    }
                    if (value != null) {
                        cell.setCellValue(value.toString());
                    }
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream(file)) {
                workbook.write(outputStream);
                JOptionPane.showMessageDialog(null, "Changes saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExcelViewer excelViewer = new ExcelViewer();
            excelViewer.setVisible(true);
        });
    }

    // Custom cell renderer to mimic Excel's styling
    private static class ExcelStyleCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Set font color
            setForeground(Color.black); // Change to the desired font color

            // Set background color
            if (isSelected) {
                setBackground(Color.lightGray); // Change to the desired background color when selected
            } else {
                setBackground(Color.white); // Change to the desired background color when not selected
            }

            setBorder(BorderFactory.createEtchedBorder());
            setHorizontalAlignment(SwingConstants.LEFT);
            return this;
        }
    }
}