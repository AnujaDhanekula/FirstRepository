<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>StringInputSeparateFindVowelCount</title>  
</head>  
<body>  
  
  <c:set var="String"  value="This is your Program"/> 
  
  			<c:out value="${String}"/> 
   
    <c:if test="${String =='a' && String =='e' && String =='i' && String =='o' && String =='u'} ">  
    		
    		<c:out value="${count}"/> 
       <p>String Contains Vowels</p>
       			
    </c:if>  
   
    
    
</body>  
</html>  