/* Generated By:JJTree: Do not edit this line. ASTMDM.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTMDM extends SimpleNode {
  private String name;
  public ASTMDM(int id) {
    super(id);
  }

  public String toString() {
    return "Operador matematico: " + this.name;
  }

  public void setName(String n) {
    this.name = n;
  }

}
/* JavaCC - OriginalChecksum=daafdc04d6e7385614c2fccd8e84b096 (do not edit this line) */
