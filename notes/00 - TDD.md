# TDD - Test Driven Development

Tests __drive__ the code

We expect a circle in TDD with:

RED -> Green -> Refactor

- 1 - A new test will initially fail
- 2 - We work to get the test to pass
- 3 - We finally optimise our code and tests

## what we test?

We'll writing test that check a single indentifiable piece
of logic or behavior.
That's a unit of functionality we want to test, a unit test.

We want to test a single functionality in isolation, a end-to-end test.

after this, we have the integration tests, but, that's is not part of TDD.

We wnat to have multiple test to a single piece of logic. not a single scenarion

We want a suite of tests, for each piece of logic

## Rules of testing

- Test one item of functionality only
- test business logic, not methods
- Test must be repeatable, and consistent
  - must always receive the same result
- tests mut be thorough
  - we need to test various cases, not only the expected

## what test should i write?

- What should the logic be?
- What the opposite to that logic?
- Are there any edge cases?
- Are there any error conditions?

## Stubs

A stub is a replacement for an object that the class we are testing has a dependency on.

we'll use an interface to  uncouple the class for the dependency, it's standard java, and a good design.
Uncouple the class from de dependency will help us test the class

We'll create our implementation fo this interface to mock and execute tests

We also have some external tools to help us create stubs and mocks, for cases where there are big interfaces.

## Mocks

One more thing we want to test is our application flow, is important to know if a method was called or not

In this case we want not only know if de response is correct, but all flow off the application.

A Mock is similar to a stub, but with a mock we have a additional features, we get to know whether  a method was called.

To do this only with junit we would have a lot of work, so we'll can use tools like mockito.

## Mockito

Mockito is a library to help us to crate mocks with many resources.
We can create a dumb implementation of a interface with the method mock().
So from this instance, we can  define what a method need to return when is called, using the method when() from mockito().
This will help to test the code, so we can verify() ou mock and get to know if the method was called, ensuring how the application behave.

Ex: if we need that a webservice is called only when we need the information, we can test this behave.

We have some other method to verify calls of a method

- times(int) - verify the exactly times o method was called
  - times(1) - is the default value
- atLeast(int) - check the minimum
- atMost(int) - check the maximum
- never() - fail if the method is called

```Java
   // Mockito.vefiry(MyClass, times()).myMethod(params);
    Mockito.verify(ISBNService,Mockito.times(2)).lookup(Mockito.anyString());
```

Mockito also check the params of the call. To check if the method was called with any String, we can use the 'Any' methods.

- Any(MyClass)
- AnyString()
- AnyInt()
- ...

Mockito also have setup and teardown function, where we can use to setup our variable for the tests and reduce code.
we have:

- @BeforeAll
- @BeforeEach
- @AfterAll
- @AfterEach

## Tautologies

When you use the same logic on your test as in your implementation.

Do not use any logic on your test, don't calculate results. Better Tests are based on examples, where you know the inputs and expected outcomes.

Avoid use logic on your test so your reduce tautologies.

## Spy

Whit spys we can create a stub to method that we do not want to implement.
Different from the mock, that makes a dummy implementation, we use a actual class of our program, and we can replace a method and define the return only on our test.
This allow us to test classes that have dependency on external services atc
