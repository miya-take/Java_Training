package MontTest;

public class TypesafeEnumMonth {
  private final String name;
  private TypesafeEnumMonth(String name){
    this.name = name;
  }

  @Override
  public String toString(){
    return name;
  }

  public static final TypesafeEnumMonth JANUARY = new TypesafeEnumMonth("JANUARY");
  public static final TypesafeEnumMonth FEBURARY = new TypesafeEnumMonth("FEBRARY");
  public static final TypesafeEnumMonth MARCH = new TypesafeEnumMonth("MARCH");

  private static final TypesafeEnumMonth[] PRIVATE_VALUES = {JANUARY, FEBURARY, MARCH};
  public static TypesafeEnumMonth[] returnValues(){
    return PRIVATE_VALUES;
  } 

}