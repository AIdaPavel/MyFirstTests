package pavel.ivanov.myfirsttests

import org.junit.Assert
import org.junit.Test
import pavel.ivanov.myfirsttests.view.EmailValidator

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_InvalidEmailWrongCharacter_ReturnFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("pavel#mail.ru"))
    }

    @Test
    fun emailValidator_InvalidEmailNotDomain_ReturnFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("pavel@"))
    }

    @Test
    fun emailValidator_InvalidEmailWrongTld_ReturnFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("pavel@gmail.ru"))
    }
}