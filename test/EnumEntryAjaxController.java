/**
* @{#} EnumTypeController.java Created on 2010-8-20 ÏÂÎç09:09:30
*
* Copyright (c) 2010 by ZHONGBO software.
*/
package com.zhongbo.framework.presentation.enumdata;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhongbo.framework.presentation.BaseController;

/**
 * @author <a href="mailto:lijing8@asiainfo-linkage.com">lijing</a>
 * @version 1.0
 */
@Controller
@RequestMapping(value="/fw/enumEntryAjax")
public class EnumEntryAjaxController extends BaseController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)  
	public @ResponseBody Map<String,String> getUserMap() {        
	    Map<String,String> test = new HashMap<String,String>();  
	    test.put("1", "2");  
	    test.put("2", "2");  
	    test.put("3", "2");  
	    test.put("4", "2");  
	    return test;  
	}
}
