package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object firstName
     
    /**
     * <p></p>
     */
    public static Object lastName
     
    /**
     * <p></p>
     */
    public static Object address
     
    /**
     * <p></p>
     */
    public static Object city
     
    /**
     * <p></p>
     */
    public static Object state
     
    /**
     * <p></p>
     */
    public static Object zipCode
     
    /**
     * <p></p>
     */
    public static Object phone
     
    /**
     * <p></p>
     */
    public static Object ssn
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object expectedWelcomeMessage
     
    /**
     * <p></p>
     */
    public static Object expectedSuccessfulAccountCreationMessage
     
    /**
     * <p></p>
     */
    public static Object expectedAccountAlreadyExistsMessage
     
    /**
     * <p></p>
     */
    public static Object expectedAccountsOverviewText
     
    /**
     * <p></p>
     */
    public static Object expectedLoginInfoLookupSuccessMessage
     
    /**
     * <p></p>
     */
    public static Object expectedUsernamePasswordInfo
     
    /**
     * <p></p>
     */
    public static Object expectedCustomerLookupText
     
    /**
     * <p></p>
     */
    public static Object expectedErrorMessage
     
    /**
     * <p></p>
     */
    public static Object expectedCustomerLookupFailureText
     
    /**
     * <p></p>
     */
    public static Object CONTACT_URL
     
    /**
     * <p></p>
     */
    public static Object ABOUT_US_URL
     
    /**
     * <p></p>
     */
    public static Object ADMIN_PAGE_URL
     
    /**
     * <p></p>
     */
    public static Object SOLUTIONS_URL
     
    /**
     * <p></p>
     */
    public static Object PRODUCTS_URL
     
    /**
     * <p></p>
     */
    public static Object SERVICES_URL
     
    /**
     * <p></p>
     */
    public static Object NEWS_URL
     
    /**
     * <p></p>
     */
    public static Object UPDATE_PROFILE_URL
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            URL = selectedVariables['URL']
            firstName = selectedVariables['firstName']
            lastName = selectedVariables['lastName']
            address = selectedVariables['address']
            city = selectedVariables['city']
            state = selectedVariables['state']
            zipCode = selectedVariables['zipCode']
            phone = selectedVariables['phone']
            ssn = selectedVariables['ssn']
            username = selectedVariables['username']
            password = selectedVariables['password']
            expectedWelcomeMessage = selectedVariables['expectedWelcomeMessage']
            expectedSuccessfulAccountCreationMessage = selectedVariables['expectedSuccessfulAccountCreationMessage']
            expectedAccountAlreadyExistsMessage = selectedVariables['expectedAccountAlreadyExistsMessage']
            expectedAccountsOverviewText = selectedVariables['expectedAccountsOverviewText']
            expectedLoginInfoLookupSuccessMessage = selectedVariables['expectedLoginInfoLookupSuccessMessage']
            expectedUsernamePasswordInfo = selectedVariables['expectedUsernamePasswordInfo']
            expectedCustomerLookupText = selectedVariables['expectedCustomerLookupText']
            expectedErrorMessage = selectedVariables['expectedErrorMessage']
            expectedCustomerLookupFailureText = selectedVariables['expectedCustomerLookupFailureText']
            CONTACT_URL = selectedVariables['CONTACT_URL']
            ABOUT_US_URL = selectedVariables['ABOUT_US_URL']
            ADMIN_PAGE_URL = selectedVariables['ADMIN_PAGE_URL']
            SOLUTIONS_URL = selectedVariables['SOLUTIONS_URL']
            PRODUCTS_URL = selectedVariables['PRODUCTS_URL']
            SERVICES_URL = selectedVariables['SERVICES_URL']
            NEWS_URL = selectedVariables['NEWS_URL']
            UPDATE_PROFILE_URL = selectedVariables['UPDATE_PROFILE_URL']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
