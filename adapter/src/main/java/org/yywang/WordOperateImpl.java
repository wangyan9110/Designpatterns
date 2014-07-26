package org.yywang;

/**
 * Aspose适配器
 */
public class WordOperateImpl implements WordOperate {

    private Aspose aspose=new Aspose();

    @Override
    public void createDoc(){
        aspose.asposeCreateDoc();
    }

    @Override
    public void createTable(){
        aspose.asposeCreateTable();
    }
}
