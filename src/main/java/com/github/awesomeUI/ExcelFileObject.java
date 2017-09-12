package com.github.awesomeUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.FilenameUtils;

public class ExcelFileObject {

    private static final List<String> excelFeedExtensions = new ArrayList<String>();
    private static final HashMap<String, Boolean> panelNameValidation = new HashMap<String, Boolean>();

    private static final String Excel_Workbook = ".xlsx";
    private static final String Excel_Workbook_code = ".xlsm";
    private static final String Excel_Binary_Workbook = ".xlsb";
    private static final String Template = ".xltx";
    private static final String Template_code_ = ".xltm";
    private static final String Excel_2003_Workbook = ".xls";
    private static final String Excel_2003_Template = ".xlt";

    public ExcelFileObject() {
        this.Init();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private void Init() {
        panelNameValidation.put(Properties.PanelName_1, false);
        panelNameValidation.put(Properties.PanelName_1, false);

        excelFeedExtensions.add(Excel_Workbook);
        excelFeedExtensions.add(Excel_Workbook_code);
        excelFeedExtensions.add(Excel_Binary_Workbook);
        excelFeedExtensions.add(Template);
        excelFeedExtensions.add(Template_code_);
        excelFeedExtensions.add(Excel_2003_Workbook);
        excelFeedExtensions.add(Excel_2003_Template);
    }

    public boolean ValidExtension(String FolderPath) {
        final String extsensionString = GetExtension(FolderPath);

        for (String str : excelFeedExtensions) {
            if (str.trim().contains(extsensionString)
                    && str.trim().contains(extsensionString)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getExcelFeedExtensions() {
        return excelFeedExtensions;
    }

    public boolean ContainsString(String inputToSearch) {
        for (int i = 0; i < excelFeedExtensions.size(); i++) {
            if (excelFeedExtensions.get(i).equals(inputToSearch)) {
                return true;
            }
        }
        return false;
    }

    public String GetExtension(String FolderPath) {
        return FilenameUtils.getExtension(FolderPath);
    }

    public boolean ValidPanelMenu() {
        final Set set2 = panelNameValidation.entrySet();
        final Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            final Map.Entry mentry2 = (Map.Entry) iterator2.next();
            if ((Boolean) mentry2.getValue() == false) {
                return false;
            }
        }

        return true;
    }

    public void setValidPanelMenuValue(String PanelName, boolean value) {
        panelNameValidation.replace(PanelName, value);
    }

}
