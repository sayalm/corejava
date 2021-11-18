package com.mycompany.program.sayal.task18withjdbc.constant;

public class SQLConstant {
    public static final String ARTICLE_GETALL="SELECT * FROM " + TableConstant.ARTICLE_TABLE;
    public static final String ARTICLE_GETBYID="SELECT * FROM " + TableConstant.ARTICLE_TABLE + " WHERE article_id=?";
    public static final String ARTICLE_DELETEBYID="DELETE * FROM " + TableConstant.ARTICLE_TABLE + " WHERE article_id=?";
    public static final String AUTHOR_GETALL="SELECT * FROM " + TableConstant.AUTHOR_TABLE;
    public static final String AUTHOR_GETBYID="SELECT * FROM " + TableConstant.AUTHOR_TABLE + " WHERE author_id=?";
    public static final String AUTHOR_DELETEBYID="DELETE * FROM " + TableConstant.AUTHOR_TABLE + " WHERE author_id=?";
    public static final String AUTHOR_GETBYARTICLEID="SELECT * FROM " + TableConstant.AUTHOR_TABLE + " WHERE article_id=?";
    public static final String AUTHOR_GETBYFIRSTNAME="SELECT * FROM " + TableConstant.AUTHOR_TABLE + " WHERE firstname=?";

}

