package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

public class ClosedOutputStream
  extends OutputStream
{
  public static final ClosedOutputStream CLOSED_OUTPUT_STREAM = new ClosedOutputStream();
  
  public void write(int paramInt)
    throws IOException
  {
    throw new IOException("write(" + paramInt + ") failed: stream is closed");
  }
}

/* Location:
 * Qualified Name:     org.apache.commons.io.output.ClosedOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */