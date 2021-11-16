<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
<xsl:for-each select="BOOKDETAILS/BOOK">
     <xsl:choose>
          <xsl:when test="PRICE[. &gt; 100]">
               <font color="red">
			BOOK NAME:<xsl:value-of select="BOOKNAME"/><BR/>
			AUTHOR: <xsl:value-of select="AFNAME"/> <xsl:text> </xsl:text> <xsl:value-of select="ALNAME" /><BR/>
			PRICE: <xsl:value-of select="PRICE"/><BR/>
			<HR/> <!--Displays a horizontal rule -->
               </font>
		</xsl:when>
	     <xsl:when test="PRICE[. &gt; 75 and . &lt; 100]">
               <font color="blue">
			BOOK NAME:<xsl:value-of select="BOOKNAME"/><BR/>
			AUTHOR: <xsl:value-of select="AFNAME"/> <xsl:text> </xsl:text> <xsl:value-of select="ALNAME" /><BR/>
			PRICE: <xsl:value-of select="PRICE"/><BR/>
			<HR/> <!--Displays a horizontal rule -->
               </font>
		</xsl:when>
		<xsl:otherwise>
			<font color="green">
			BOOK NAME:<xsl:value-of select="BOOKNAME"/><BR/>
			AUTHOR: <xsl:value-of select="AFNAME"/> <xsl:text> </xsl:text> <xsl:value-of select="ALNAME" /><BR/>
			PRICE: <xsl:value-of select="PRICE"/><BR/>
			<HR/> <!--Displays a horizontal rule -->
			</font>
		</xsl:otherwise>
</xsl:choose>
</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>