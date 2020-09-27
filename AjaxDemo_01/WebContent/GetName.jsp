<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%
Map<Integer,String >names = new HashMap<>();

names.put(101,"Hema");
names.put(102,"Pooja");
names.put(103,"Bindhu");
names.put(104,"Subbu");
names.put(105,"Sonu");
names.put(106,"Tim");
int slno=Integer.parseInt(request.getParameter("slno"));
//Student student = new StudentService().find(slno);
//out.print(student.toCSV());
out.print(names.get(slno));
%>
