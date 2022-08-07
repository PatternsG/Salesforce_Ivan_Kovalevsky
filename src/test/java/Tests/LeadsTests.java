package Tests;

import Pages.Enams.*;
import Pages.Modal.NewLeadModal;
import Pages.Models.Lead;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeadsTests extends BaseTest {

    private NewLeadModal newLeadModal;
    private Lead lead;

    @BeforeClass
    public void initialization() {
        newLeadModal = new NewLeadModal(driver);
    }

    @Test
    public void positiveLeadsTest() {
        loginPage.initialization(USER_NAME, PASSWORD);
        homePage.waitForPageLoaded();
        homePage.clickLeadsButton();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        leadInformationPage.waitForPageLoaded();
        lead = new Lead(LeadStatus.NEW, "333333333", Salutation.MR, "Jora", "Ivanov",
                "TMS", "jora@gmail.ru", "good man", Rating.HOT, "jora.com", "streets",
                "city", "state", "12345", "county", "1", LeadSource.ADVERTISEMENT,
                "17,5", Industry.BANKING, "thanks");
        newLeadModal.fillForm(lead);
        leadInformationPage.clickSaveButton();
        leadDetailsPage.waitForPageLoaded();
        Assert.assertEquals(newLeadModal.getActualForm(), newLeadModal.getExpectedForm());
    }
}
