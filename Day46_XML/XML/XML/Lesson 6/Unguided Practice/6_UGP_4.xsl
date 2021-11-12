<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
 <html>
 <body>
    <xsl:for-each select="CUSTDETAILS/CUSTOMER">
    <li><xsl:value-of select="@CUSTID"/></li>
    <li><xsl:value-of select="CUSTNAME"/></li>
    <li><xsl:value-of select="ADDRESS"/></li>
    <li><xsl:value-of select="CITY"/></li>
    <li><xsl:value-of select="STATE"/></li>
    <li><xsl:value-of select="COUNTRY"/></li>
    <li><xsl:value-of select="PHONE"/></li>
    <br></br>
    </xsl:for-each>
    </body>
 </html>
</xsl:template>
</xsl:stylesheet>
