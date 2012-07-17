package org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/org/*")
public class GridController {

	@RequestMapping(value = "/demo.grid")
	public @ResponseBody
	String gridSearch(HttpServletRequest request, HttpServletResponse response) {
		
		response.setCharacterEncoding("GBK"); 
		
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> mo = new HashMap<String, String>();

		mo.put("CustomerID", "1");
		mo.put("CompanyName", "����01");
		list.add(mo);

		mo = new HashMap<String, String>();
		mo.put("CustomerID", "2");
		mo.put("CompanyName", "����02");
		list.add(mo);
		
		Map<String,Object> pageInfo = new HashMap<String,Object>();
		pageInfo.put("Total", "2");
		
		List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		
		for (Map<String, String> map : list) {
			Map<String,String> cellMap = new HashMap<String,String>();
			cellMap.put("CustomerID",map.get("CustomerID"));
			cellMap.put("CompanyName",map.get("CompanyName"));
			mapList.add(cellMap);
		}
		
		pageInfo.put("Rows",mapList);
		
		JSONObject object = new JSONObject(pageInfo);
		return object.toString();
	}

	@RequestMapping(value = "/role.grid")
	public @ResponseBody
	String roleGridSearch(HttpServletRequest request,
			HttpServletResponse response) {

		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		Map<String, String> mo = new HashMap<String, String>();

		mo.put("RoleName", "��ɫ1");
		mo.put("RoleDesc", "��ɫ����1");
		list.add(mo);

		mo = new HashMap<String, String>();
		mo.put("RoleName", "��ɫ2");
		mo.put("RoleDesc", "��ɫ����2");
		list.add(mo);
		
		Map<String,Object> pageInfo = new HashMap<String,Object>();
		pageInfo.put("Total", "7");
		
		List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		for (int i = 0; i < list.size(); i++) {
			Map<String,String> cellMap = new HashMap<String,String>();
			cellMap.put("RoleName", ((Map<String,String>) list.get(i)).get("RoleName"));
			cellMap.put("RoleDesc", ((Map<String,String>) list.get(i)).get("RoleDesc"));
			mapList.add(cellMap);
		}
		
		pageInfo.put("Rows",mapList);
		
		JSONObject object = new JSONObject(pageInfo);
		return object.toString();
	}

	@RequestMapping(value = "/flexigrid.grid")
	public @ResponseBody
	String flexiGridSearch(HttpServletRequest request,
			HttpServletResponse response) {

		// ����
		List list = new ArrayList();
		Map<String, String> mo = new HashMap<String, String>();

		mo.put("iso", "iso1");
		mo.put("name", "name1");
		list.add(mo);

		mo = new HashMap<String, String>();
		mo.put("iso", "iso2");
		mo.put("name", "name2");
		list.add(mo);

		// ����json�����Map���˴������ʹ��StringBuffer ƴ��json�ַ������棬�����������ȽϷ�����
		Map pageInfo = new HashMap();
		// ��ǰҳ������
		pageInfo.put("page", 2);
		
		// ������������
		// pageInfo.put("total", dbTest.getJobCount());
		pageInfo.put("total", 50);

		List mapList = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			Map cellMap = new HashMap();
			cellMap.put("id", ((Map) list.get(i)).get("id"));
			cellMap.put(
					"cell",
					new Object[] { ((Map) list.get(i)).get("iso"),
							((Map) list.get(i)).get("name"),
							((Map) list.get(i)).get("name"),
							((Map) list.get(i)).get("name"),
							((Map) list.get(i)).get("name") });
			mapList.add(cellMap);
		}
		pageInfo.put("rows", mapList);
		JSONObject object = new JSONObject(pageInfo);
		
		// �ο���ʽ
		//String str ="{\"total\":10,\"page\":123,\"rows\":[{\"cell\":[\"iso1\",\"name1\",\"name1\",\"name1\",\"name1\"]},{\"cell\":[\"iso2\",\"name2\",\"name2\",\"name2\",\"name2\"]}]}";
		
		return object.toString();
	}
	
	public static void main(String[] args) {

		Map<String,Object> pageInfo = new HashMap<String,Object>();
		pageInfo.put("Total", "7");
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String, Object> mo = new HashMap<String, Object>();

		mo.put("RoleName", "��ɫ1");
		mo.put("RoleDesc", "��ɫ����1");
		list.add(mo);

		mo = new HashMap<String, Object>();
		mo.put("RoleName", "��ɫ2");
		mo.put("RoleDesc", "��ɫ����2");
		list.add(mo);
		
		List<Map<String,Object>> mapList = new ArrayList<Map<String,Object>>();
		for (int i = 0; i < list.size(); i++) {
			Map<String,Object> cellMap = new HashMap<String,Object>();
			cellMap.put("RoleName", ((Map<String,Object>) list.get(i)).get("RoleName"));
			cellMap.put("RoleDesc", ((Map<String,Object>) list.get(i)).get("RoleDesc"));
			cellMap.put("RoleDesc", 12345);
			mapList.add(cellMap);
		}
		
		pageInfo.put("Rows",mapList);
		
		JSONObject object = new JSONObject(pageInfo);
		System.out.println(object.toString());
	}
	
}