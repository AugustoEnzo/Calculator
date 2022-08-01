import scalafx.beans.property.DoubleProperty

import scala.language.postfixOps

// SCALA FX PROPERTIES

//val speed = DoubleProperty(55)
//val speed = new DoubleProperty(this, "speed", 55)

//speed()
//speed.value

// ADDING LISTENERS

//speed.onChange { (source, oldValue, newValue) => doSomething() }

//val speed = new DoubleProperty(this, "speed", 55) {
//  onChange { (_, oldValue), newValue } =>
//    println(
//      s"Value of the property '$name' is changing from '$oldValue' to $newValue")
//  }
//}
//
//speed() = 60
//speed() = 75
//speed.value

// REMOVING LISTENERS

//val prop = DoubleProperty(0)
//val subscription = prop.onChange { (_, _, newValue) } =>
//                  println(S"Property changed value to $newValue")
//                }
//
//prop.value = 1
//subscription.cancel()
//
//// Listener will not be notified about this change
//prop.value = 2
//
//val base = DoubleProperty(15)
//val height = DoubleProperty(10)
//val area = DoubleProperty(0)
//
//area <== base * height / 2
//
//printValues()
//
//println("Setting base to " + 20)
//base() = 20
//
//printValues()
//
//println("Setting height to " +  5)
//height() = 5
//
//printValues()
//when(cond) choose(value1) otherwise(value2)
//new Rectangle {
//  fill <== when (hover) choose (Green) otherwise Red
//}