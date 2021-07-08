package org.lesson.headtag;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ResponseHeaderTag extends TagSupport {

    private String cacheControl;

    private String pragma;

    private String expires;

    public String getCacheControl() {
        return cacheControl;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    public String getPragma() {
        return pragma;
    }

    public void setPragma(String pragma) {
        this.pragma = pragma;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    @Override
    public int doStartTag() throws JspException{
        HttpServletResponse response = (HttpServletResponse) this.pageContext.getResponse();
        response.setHeader("Cache-Control",this.getCacheControl());
        response.setHeader("Pragma", this.getPragma());
        response.setHeader("Expires",this.getExpires());
        return super.doStartTag();
    }
}
