<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
<table border="2">
<thead> 
	<th> TITLE </th> 
	<th> AUTHOR </th> 
	<th> PRICE </th> 
	<th> QUANTITY </th>
</thead>
<tbody>
<xsl:for-each select="BOOKDETAILS/BOOK">
<tr>
<td><xsl:value-of select="TITLE"/> </td>
<td> <xsl:value-of select="AFNAME"/> 
<xsl:text> </xsl:text> 
<xsl:value-of select="ALNAME"/> 
</td>
<td><xsl:value-of select="PRICE" /></td>
<td><xsl:value-of select="QUANTITY" /> </td>
</tr>
</xsl:for-each>
</tbody>
</table>
</xsl:template>
</xsl:stylesheet>
