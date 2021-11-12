<?xml version="1.0" ?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
 <xsl:for-each select="EMPDETAILS/EMP">
<xsl:choose>
<xsl:when test="SALARY[. &gt; 250]">
 <font color="green" /> 
<li>
 <xsl:value-of select="ENAME" /> 
 </li>
 <br /> 
<li>
 <xsl:value-of select="DESG" /> 
 </li>
 <br /> 
<li>
 <xsl:value-of select="DEPT" /> 
 </li>
 <br /> 
 <li>
 <xsl:value-of select="SALARY" /> 
 </li>
 <br /> 
 </xsl:when>
 <xsl:otherwise>
 <font color="blue" /> 
 <li>
 <xsl:value-of select="ENAME" /> 
 </li>
 <br /> 
 <li>
 <xsl:value-of select="DESG" /> 
 </li>
 <br /> 
 <li>
 <xsl:value-of select="DEPT" /> 
 </li>
 <br /> 
<li>
 <xsl:value-of select="SALARY" /> 
 </li>
 <br /> 
 </xsl:otherwise>
 </xsl:choose>
 </xsl:for-each>
 </xsl:template>
 </xsl:stylesheet>
