fun main(args: Array<String>) {
 var employee1= totalSalary(8,700)
    println(employee1)
    var employee2=totalSalary(12,700)
    println(employee2)
  var employee3=  totalSalary(24,700)
    println(employee3)
    var w=totalSalaryOfEmployees(5600,8400,16800)
    println(w)

}
    fun totalSalary(hoursWorked: Int, hourlyRate: Int) :Int{
        var totalSalary= hoursWorked * hourlyRate
        return totalSalary

        }
      fun totalSalaryOfEmployees(employee1:Int,employee2:Int,employee3:Int):Int{
          var employee1=5600
          var employee2=8400
          var employee3=16800
          var total=employee1+employee2+employee1
          return total
      }

