<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="PRODUCT">
	<xsl:value-of select="PRODUCTNAME" />
		<xsl:if test="position()!=last()"> , </xsl:if>
</xsl:template>
<xsl:template match="/">
<table border="2">
<thead>
	<tr>
	<th> ID </th> <th> First Name </th> <th> Last Name </th> <th> Address </th> 
	<th> Phone </th> <th> Products </th>
	</tr>
</thead>
<tbody>
<xsl:for-each select="SUPPLIERDATA/SUPPLIER">
<tr> 
	<xsl:choose>
	<xsl:when test="position() mod 2 = 0"> 	
		
			<td> <font color="red"><xsl:value-of select="@SUPPID"/> </font></td>
			<td><font color="red"><xsl:value-of select="FIRSTNAME"/></font></td>
			<td><font color="red"><xsl:value-of select="LASTNAME"/></font></td>
			<td><font color="red"><xsl:value-of select="ADDRESS"/></font></td>
			<td> <font color="red"><xsl:value-of select="PHONE"/> </font></td>
			<td><font color="red"><xsl:apply-templates select="PRODUCT"/> </font></td>
	</xsl:when>
	<xsl:otherwise>
		<td> 	<xsl:value-of select="@SUPPID"/></td>
		<td><xsl:value-of select="FIRSTNAME"/></td>
		<td><xsl:value-of select="LASTNAME"/></td>
		<td><xsl:value-of select="ADDRESS"/></td>
		<td> <xsl:value-of select="PHONE"/> </td>
		<td><xsl:apply-templates select="PRODUCT"/></td>
	</xsl:otherwise>
	</xsl:choose>
</tr>
</xsl:for-each>
</tbody>
</table>
</xsl:template>
</xsl:stylesheet>
