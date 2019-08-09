package edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.util;

import java.util.HashMap;
import java.util.Map;

public class ViewLinkHelpers {

    public  static Map<String, String> pageLinks = new HashMap<String, String>() {
        {
            put("HOME_INDEX_URL", "/esupplier/home");
            //customer url
            put("PRODUCT_LIST_URL", "/esupplier/product/list");
            put("PRODUCT_ADD_URL", "/esupplier/product/add");
            put("PRODUCT_EDIT_URL", "/esupplier/product/edit");
        }
    };





}
