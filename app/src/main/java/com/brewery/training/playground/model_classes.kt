package com.brewery.training.playground

open class CompanyEmployee(val name: String)

class SalariedEmployee(
    val salary: Double,
    name: String
) : CompanyEmployee(name)

