package test_scripts;

public class xPathAxes { /**
 * X-path Axes :
 * 1. following
 * 2. ancestor
 * 3. following-sibling
 * 4. preceding
 * 5. child
 * 6. parent
 *
 * Syntax:
 * //tagName[@id='abcd']//<xPath-axes>::<tagNameOfSecondWebElement>
 * Example:
 * <div>
 *     <div id='abcd'></div>
 *     <div>Customer-abcd status</div>
 *     <div custName='Peace World'></div>
 *     <div ssn='1234'></div>
 * </div>
 * <div>
 *     <div id='wxyz'></div>
 *     <div>Customer-wxyz status</div>
 *     <div custName='Happy John'></div>
 *     <div ssn='9999'></div>
 * </div>
 */
    /**
     * following Example :
     * //div[@id='abcd']//following::div[@custName='Happy Jhn']]
     * //input[@name='firstname']//following::select[@id='day']
     */
   // WebElement dateDD = driver.findElement(By.xpath("//input[@name='firstname']//following::select[@id='day']"));
    /**
     * preceding Example : (opposite of following)
     * //input[@value='Log In']//preceding::input
     */
    /**
     * ancestor Example :
     * //input[@name='firstname']//ancestor::form[@id='reg']
     */
    /**
     * child Example : (opposite of ancestor)
     * //tbody//child::input
     */
    /**
     * following-sibling Example :
     * //div[contains(text(),'Mobile number or email address')]//following-sibling::input[@name='reg_email__']
     */
    /**
     * parent Example :
     * //input[@id='u_0_r']//parent::*
     */
}
