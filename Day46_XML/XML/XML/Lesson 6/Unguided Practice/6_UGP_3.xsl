<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
 <html>
 <body>
 <table border="2" bgcolor="yellow">
   <tr>
    <th>Employee Name</th>
    <th>Date of Birth</th>
    <th>Address</th>
    <th>Designation</th>
   </tr>
   <xsl:for-each select="EMPDETAILS/EMP">
   <tr>
    <td><xsl:value-of select="EMPNAME"/></td>
    <td><xsl:value-of select="DOB"/></td>
    <td><xsl:value-of select="ADDRESS"/></td>
    <td><xsl:value-of select="DESIG"/></td>
   </tr>
   </xsl:for-each>
  </table>
  </body>
 </html>
</xsl:template>
</xsl:stylesheet>
