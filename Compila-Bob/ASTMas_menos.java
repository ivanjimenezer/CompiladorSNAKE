/* Generated By:JJTree: Do not edit this line. ASTMas_menos.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTMas_menos extends SimpleNode {
  private String name;
  public ASTMas_menos(int id) {
    super(id);
  }

  public String toString() {
    return "Operador matematico: " + this.name;
  }

  public void setName(String n) {
    this.name = n;
  }

}
/* JavaCC - OriginalChecksum=44da43d906d96af5477109ed104f9840 (do not edit this line) */