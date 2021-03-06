package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.io.IOException;
import java.io.Serializable;

public class MinimalPrettyPrinter
  implements PrettyPrinter, Serializable
{
  public static final String DEFAULT_ROOT_VALUE_SEPARATOR = " ";
  private static final long serialVersionUID = 1L;
  protected String _rootValueSeparator = " ";
  
  public MinimalPrettyPrinter()
  {
    this(" ");
  }
  
  public MinimalPrettyPrinter(String paramString)
  {
    _rootValueSeparator = paramString;
  }
  
  public void beforeArrayValues(JsonGenerator paramJsonGenerator)
    throws IOException, JsonGenerationException
  {}
  
  public void beforeObjectEntries(JsonGenerator paramJsonGenerator)
    throws IOException, JsonGenerationException
  {}
  
  public void setRootValueSeparator(String paramString)
  {
    _rootValueSeparator = paramString;
  }
  
  public void writeArrayValueSeparator(JsonGenerator paramJsonGenerator)
    throws IOException, JsonGenerationException
  {
    paramJsonGenerator.writeRaw(',');
  }
  
  public void writeEndArray(JsonGenerator paramJsonGenerator, int paramInt)
    throws IOException, JsonGenerationException
  {
    paramJsonGenerator.writeRaw(']');
  }
  
  public void writeEndObject(JsonGenerator paramJsonGenerator, int paramInt)
    throws IOException, JsonGenerationException
  {
    paramJsonGenerator.writeRaw('}');
  }
  
  public void writeObjectEntrySeparator(JsonGenerator paramJsonGenerator)
    throws IOException, JsonGenerationException
  {
    paramJsonGenerator.writeRaw(',');
  }
  
  public void writeObjectFieldValueSeparator(JsonGenerator paramJsonGenerator)
    throws IOException, JsonGenerationException
  {
    paramJsonGenerator.writeRaw(':');
  }
  
  public void writeRootValueSeparator(JsonGenerator paramJsonGenerator)
    throws IOException, JsonGenerationException
  {
    if (_rootValueSeparator != null) {
      paramJsonGenerator.writeRaw(_rootValueSeparator);
    }
  }
  
  public void writeStartArray(JsonGenerator paramJsonGenerator)
    throws IOException, JsonGenerationException
  {
    paramJsonGenerator.writeRaw('[');
  }
  
  public void writeStartObject(JsonGenerator paramJsonGenerator)
    throws IOException, JsonGenerationException
  {
    paramJsonGenerator.writeRaw('{');
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.util.MinimalPrettyPrinter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */