/* Generated By:JJTree: Do not edit this line. ASTVariable_dato.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTVariable_dato extends SimpleNode {
  private String name;
  public ASTVariable_dato(int id) {
    super(id);
  }

  public String toString() {
      switch(this.name){
          case "E_":{
            return "Declaracion tipo Entero: " + this.name;
          }
          case "C_":{
            return "Declaracion tipo Cadena: " + this.name;
          }
          case "L_":{
            return "Declaracion tipo Logico: " + this.name;
          }
          case "D_":{
            return "Declaracion tipo Decimal:" + this.name;
          }
          default:
          return "Error: "+this.name;
   }
  }

  public void setName(String n) {
    this.name = n;
  }

}
/* JavaCC - OriginalChecksum=d2a09d882e51deaa933b4284327fb36c (do not edit this line) */
