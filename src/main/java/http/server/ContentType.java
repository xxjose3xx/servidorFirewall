package http.server;

public enum ContentType {
  
  HTML("text/html"),
  
  CSS("text/css"),
  
  JAVASCRIPT("text/javascript"),
  
  PNG("image/png"),
  
  JPEG("image/jpeg"),
  
  GIF("image/gif"),
  
  BMP("image/bmp"),
  
  PLAIN("text/plain");
  
  private String value;

  private ContentType(String value) {
    this.value = value;
  }
  
  @Override
  public String toString() {
    return value;
  }
}