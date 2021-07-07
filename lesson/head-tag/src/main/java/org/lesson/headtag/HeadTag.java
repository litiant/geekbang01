package org.lesson.headtag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HeadTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException{
        try{
            this.pageContext.getOut().write("");
        }catch(IOException e){
            e.printStackTrace();
        }

        return super.doStartTag();
    }

}
