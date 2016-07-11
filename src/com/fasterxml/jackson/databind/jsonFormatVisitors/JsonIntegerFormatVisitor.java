package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.core.JsonParser.NumberType;

public abstract interface JsonIntegerFormatVisitor
  extends JsonValueFormatVisitor
{
  public abstract void numberType(JsonParser.NumberType paramNumberType);
  
  public static class Base
    extends JsonValueFormatVisitor.Base
    implements JsonIntegerFormatVisitor
  {
    public void numberType(JsonParser.NumberType paramNumberType) {}
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */