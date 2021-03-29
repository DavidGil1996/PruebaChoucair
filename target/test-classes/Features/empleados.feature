#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Keywords
  Scenario: Funcionamiento barra de busqueda Keywords
    Given Ingresar a la pagina "https://www.choucairtesting.com/"
    And seleccionar la opcion empleos
    When Buscar empleos disponibles cargo "pruebas" y ciudad "bogota"
    And Seleccion de empleo
    And Diligenciamiento formulario campo nombre 
   
   
    
   # Then I validate the outcomes
   # And check more outcomes


