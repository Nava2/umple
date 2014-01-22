/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE ${last.version} modeling language!*/

package cruise.umple.compiler;

/**
 * An association end represents one logical end of an association
 * 
 * See also AssociationVariable
 * TODO: Code smell referenceToClassName is a duplication, can access via the association 
 * Create a derived attribute otherend (the other AssociationEnd)
 * In Umple_Code.ump: Methods for computing compound properties
 * @umplesource Umple.ump 544
 * @umplesource Umple_Code.ump 1494
 */
// line 544 "../../../../src/Umple.ump"
// line 1494 "../../../../src/Umple_Code.ump"
public class AssociationEnd
{
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  public @interface umplesourcefile{int[] line();String[] file();int[] javaline();int[] length();}

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationEnd Attributes
  private String roleName;
  private String className;
  private String modifier;
  private String referenceToClassName;
  private Multiplicity multiplicity;
  private boolean isDefaultRoleName;
  private String priority;

  //AssociationEnd Associations
  private Association association;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetMultiplicity;
  private boolean canSetRoleName;
  private boolean canSetClassName;
  private boolean canSetModifier;
  private boolean canSetReferenceToClassName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationEnd(String aRoleName, String aClassName, String aModifier, String aReferenceToClassName, Multiplicity aMultiplicity)
  {
    cachedHashCode = -1;
    canSetMultiplicity = true;
    canSetRoleName = true;
    canSetClassName = true;
    canSetModifier = true;
    canSetReferenceToClassName = true;
    roleName = aRoleName;
    className = aClassName;
    modifier = aModifier;
    referenceToClassName = aReferenceToClassName;
    multiplicity = aMultiplicity;
    isDefaultRoleName = false;
    priority = "";
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRoleName(String aRoleName)
  {
    boolean wasSet = false;
    if (!canSetRoleName) { return false; }
    roleName = aRoleName;
    wasSet = true;
    return wasSet;
  }

  public boolean setClassName(String aClassName)
  {
    boolean wasSet = false;
    if (!canSetClassName) { return false; }
    className = aClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setModifier(String aModifier)
  {
    boolean wasSet = false;
    if (!canSetModifier) { return false; }
    modifier = aModifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setReferenceToClassName(String aReferenceToClassName)
  {
    boolean wasSet = false;
    if (!canSetReferenceToClassName) { return false; }
    referenceToClassName = aReferenceToClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setMultiplicity(Multiplicity aMultiplicity)
  {
    boolean wasSet = false;
    if (!canSetMultiplicity) { return false; }
    multiplicity = aMultiplicity;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDefaultRoleName(boolean aIsDefaultRoleName)
  {
    boolean wasSet = false;
    isDefaultRoleName = aIsDefaultRoleName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPriority(String aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  @umplesourcefile(line={558},file={"Umple.ump"},javaline={137},length={1})
  public String getRoleName()
  {
    // line 558 "../../../../src/Umple.ump"
    if (roleName == null) { return ""; }
    return roleName;
  }

  @umplesourcefile(line={559},file={"Umple.ump"},javaline={144},length={1})
  public String getClassName()
  {
    // line 559 "../../../../src/Umple.ump"
    if (className == null) { return ""; }
    return className;
  }

  /**
   * potential enum 'internal'
   */
  @umplesourcefile(line={560},file={"Umple.ump"},javaline={154},length={1})
  public String getModifier()
  {
    // line 560 "../../../../src/Umple.ump"
    if (modifier == null || "".equals(modifier)) { return "internal"; }
    return modifier;
  }

  @umplesourcefile(line={561},file={"Umple.ump"},javaline={161},length={1})
  public String getReferenceToClassName()
  {
    // line 561 "../../../../src/Umple.ump"
    if (referenceToClassName == null) { return ""; }
    return referenceToClassName;
  }

  public Multiplicity getMultiplicity()
  {
    return multiplicity;
  }

  public boolean getIsDefaultRoleName()
  {
    return isDefaultRoleName;
  }

  public String getPriority()
  {
    return priority;
  }

  public boolean isIsDefaultRoleName()
  {
    return isDefaultRoleName;
  }

  public Association getAssociation()
  {
    return association;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    AssociationEnd compareTo = (AssociationEnd)obj;
  
    if (multiplicity == null && compareTo.multiplicity != null)
    {
      return false;
    }
    else if (multiplicity != null && !multiplicity.equals(compareTo.multiplicity))
    {
      return false;
    }

    if (roleName == null && compareTo.roleName != null)
    {
      return false;
    }
    else if (roleName != null && !roleName.equals(compareTo.roleName))
    {
      return false;
    }

    if (className == null && compareTo.className != null)
    {
      return false;
    }
    else if (className != null && !className.equals(compareTo.className))
    {
      return false;
    }

    if (modifier == null && compareTo.modifier != null)
    {
      return false;
    }
    else if (modifier != null && !modifier.equals(compareTo.modifier))
    {
      return false;
    }

    if (referenceToClassName == null && compareTo.referenceToClassName != null)
    {
      return false;
    }
    else if (referenceToClassName != null && !referenceToClassName.equals(compareTo.referenceToClassName))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (multiplicity != null)
    {
      cachedHashCode = cachedHashCode * 23 + multiplicity.hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (roleName != null)
    {
      cachedHashCode = cachedHashCode * 23 + roleName.hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (className != null)
    {
      cachedHashCode = cachedHashCode * 23 + className.hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (modifier != null)
    {
      cachedHashCode = cachedHashCode * 23 + modifier.hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (referenceToClassName != null)
    {
      cachedHashCode = cachedHashCode * 23 + referenceToClassName.hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetMultiplicity = false;
    canSetRoleName = false;
    canSetClassName = false;
    canSetModifier = false;
    canSetReferenceToClassName = false;
    return cachedHashCode;
  }

  public void delete()
  {
    if (association != null)
    {
      association.delete();
    }
  }

  @umplesourcefile(line={1502},file={"Umple_Code.ump"},javaline={318},length={3})
   public boolean isNavigable(){
    return !getModifier().toLowerCase().equals("nonnavigable");
  }

  @umplesourcefile(line={1507},file={"Umple_Code.ump"},javaline={323},length={3})
   public String getLowerBoundString(){
    return getMultiplicity().getLowerBound() == -1 ? "*" : getMultiplicity().getLowerBound() + "";
  }

  @umplesourcefile(line={1512},file={"Umple_Code.ump"},javaline={328},length={3})
   public String getUpperBoundString(){
    return getMultiplicity().getUpperBound() == -1 ? "*" : getMultiplicity().getUpperBound() + "";
  }

  @umplesourcefile(line={1517},file={"Umple_Code.ump"},javaline={333},length={3})
   public String getDisplayRoleName(){
    return isDefaultRoleName ? "" : getRoleName();
  }

  @umplesourcefile(line={1522},file={"Umple_Code.ump"},javaline={338},length={18})
   public String toSimpleString(){
    if (getMultiplicity().getLowerBound() == 0 && getMultiplicity().getUpperBound() == MULT_MANY)
    {
      return formatEnd(getMultiplicity().getUpperBound());
    }
    else if (getMultiplicity().getLowerBound() == MULT_MANY && getMultiplicity().getUpperBound() == MULT_MANY)
    {
      return formatEnd(getMultiplicity().getLowerBound()) + ".." + formatEnd(getMultiplicity().getUpperBound());
    }
    else if (getMultiplicity().getLowerBound() == getMultiplicity().getUpperBound())
    {
      return formatEnd(getMultiplicity().getLowerBound());
    }
    else
    {
      return formatEnd(getMultiplicity().getLowerBound()) + ".." + formatEnd(getMultiplicity().getUpperBound());
    }
  }

  @umplesourcefile(line={1542},file={"Umple_Code.ump"},javaline={358},length={22})
   public String toGenericString(){
    if (getMultiplicity().getLowerBound() == 0 && getMultiplicity().getUpperBound() == MULT_MANY)
    {
      return formatEnd(getMultiplicity().getUpperBound());
    }
    else if (getMultiplicity().getLowerBound() == MULT_MANY && getMultiplicity().getUpperBound() == MULT_MANY)
    {
      return formatEnd(getMultiplicity().getLowerBound()) + ".." + formatEnd(getMultiplicity().getUpperBound());
    }
    else if (getMultiplicity().getLowerBound() == getMultiplicity().getUpperBound())
    {
      return formatGenericEnd(getMultiplicity().getLowerBound(),"n");
    }
    else if (getMultiplicity().getLowerBound() == 0 || getMultiplicity().getLowerBound() == 1)
    {
      return getMultiplicity().getLowerBound() + ".." + formatGenericEnd(getMultiplicity().getUpperBound(),"n");
    }
    else
    {
      return formatGenericEnd(getMultiplicity().getLowerBound(),"n") + ".." + formatGenericEnd(getMultiplicity().getUpperBound(),"m");
    }
  }

  @umplesourcefile(line={1566},file={"Umple_Code.ump"},javaline={382},length={26})
   public String toString(){
    String asText = "";

    if (!getModifier().equals("internal"))
    {
      asText += getModifier() + " " + asText;
    }
    asText += toSimpleString();

    if (getRoleName().length() > 0)
    {
      asText += " [" + roleName + "]";
    }

    if (getClassName().length() > 0)
    {
      asText += " " + className;
    }

    if (getReferenceToClassName().length() > 0)
    {
      asText += " -- " + referenceToClassName;
    }

    return asText;
  }

  @umplesourcefile(line={1594},file={"Umple_Code.ump"},javaline={410},length={3})
   private String formatEnd(int aValue){
    return aValue == MULT_MANY ? "*" : aValue + "";
  }

  @umplesourcefile(line={1600},file={"Umple_Code.ump"},javaline={415},length={14})
   private String formatGenericEnd(int aValue, String defaultIfNotOneOrMany){
    if (aValue == MULT_MANY)
    {
      return "*";
    }
    else if (aValue == 0 || aValue == 1)
    {
      return aValue + "";
    }
    else
    {
      return defaultIfNotOneOrMany;
    }
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  //  @umplesourcefile(line={1497},file={"Umple_Code.ump"},javaline={433},length={2})
  private static int MULT_MANY = -1 ;

  
}