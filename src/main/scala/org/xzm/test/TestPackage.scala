package org.xzm.test

  object TestPackage{
    def main(args: Array[String]){
      output
    }
}


package A{
  package B{

    package C1{
      class CC1{
        def doWhat()={
        }
      }
    }

    package C2{
       class CC2{
        private[B] def doWhat()={
        }
      }
    }

  }

}