
class Calculator {
  private double first, second;
  private String oP;

  Calculator() {
  };

  void operation(String str) {
    first = second;
    second = 0;
    oP = str;
  }

  void add() {
    operation("+");
  }

  void subtract() {
    operation("-");
  }

  void multiply() {
    operation("*");
  }

  void divide() {
    operation("/");
  }

  void factorial() {

    operation("!");

  }

  void pow() {
    operation("POW");
  }

  void rootSquare() {

    operation("SQRT");
  }

  void nepLog() {

    operation("ln");
  }

  void compute() {

    if (oP == "+") {
      second = first + second;
      // true;
    } else if (oP == "-") {
      second = first - second;
      // true;
    } else if (oP == "*") {
      second = first * second;
      // true;
    } else if (oP == "/") {
      second = first / second;
      // true;
    } else if (oP == "!") {
      int factorials = 1;
      for (int i = 1; i <= first; i++) {
        factorials *= i;
      }
      second = factorials;
      // this.exists = true;
    } else if (oP == "POW") {
      second = Math.pow(first, second);
      // true;
    } else if (oP == "SQRT") {
      second = Math.sqrt(second);
      // true;
    } else if (oP == "ln") {
      second = Math.log(second);
      // true;
    }

  }

  void clear() {
    first = 0;
    second = 0;
    oP = "";

  }

  double display() {

    return second;
  }

  double getFirst() {
    return first;
  }

  double getSecond() {
    return second;
  }

  String getOp() {
    return oP;
  }

  void setFirst(double f) {
    this.first = f;
  }

  void setSecond(double s) {
    this.second = s;
  }

  void setOp(String o) {
    this.oP = o;
  }
}
