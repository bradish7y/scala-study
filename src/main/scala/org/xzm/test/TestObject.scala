package org.xzm.test

class TestObject{

}

class Account{
  def Out(){
    Account.deposit(5000)
    println(Account.balance)
  }
}
object Account{
  private var balance: Double = 5000

  def apply()={
    new Account()
  }
  def displayBalance(): Double ={
    balance
  }

  def deposit(m: Double){
    this.balance += m
  }

  def withDraw(m: Double){
    this.balance -= m
  }
}

object Enum extends Enumeration{
  type Enum = Value
  val red, green, blue = Value
  val black = Value(4, "not like")
}

import Enum._
object TestObject{
  def doWhat(color:Enum ){
    if(Enum.black == color){
      println(true)
    }
  }
  def main(args: Array[String]){
    println(Account.displayBalance)
    Account.deposit(500)
    println(Account.displayBalance)
    Account.withDraw(2500)
    println(Account.displayBalance)

    val account = new Account
    account.Out
    println(Account.displayBalance)

    println(black.id)

    doWhat(Enum.red)
  }
}