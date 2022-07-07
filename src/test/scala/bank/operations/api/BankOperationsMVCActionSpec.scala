package bank.operations.api

import bank.operations.Components.AccountEntityCalls
import bank.operations.domain.{AbstractAccountEntity, AccountEntity}
import kalix.scalasdk.testkit.MockRegistry
import org.mockito.Mockito
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import java.util.UUID

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

class BankOperationsMVCActionSpec
    extends AnyWordSpec
    with Matchers {

  "BankOperationsMVCAction" must {

    "have example test that can be removed" in {

      val mcokAccountEntity = Mockito.mock(classOf[AccountEntityCalls])

      (mcokAccountEntity.createAccount _)



      val mockaa = MockRegistry.withMock(classOf[AccountEntity])



      val service = BankOperationsMVCActionTestKit(new BankOperationsMVCAction(_))

      val accountCreationRequest = AccountCreationRequest(
        uid = UUID.randomUUID().toString,
        name = "Yash Gupta",
        address = "RandomAddress",
        city = "RandomCity",
        state = "RandomState"
      )
      val result = service.createAccountRequest(accountCreationRequest)

      println(result.reply)

      result.reply.accNo.nonEmpty shouldBe true

      // use the testkit to execute a command
      // and verify final updated state:
      // val result = service.someOperation(SomeRequest)
      // verify the reply
      // result.reply shouldBe expectedReply
    }

    "handle command createAccountRequest" in {
      val service = BankOperationsMVCActionTestKit(new BankOperationsMVCAction(_))
          pending
      // val result = service.createAccountRequest(AccountCreationRequest(...))
    }

  }
}
