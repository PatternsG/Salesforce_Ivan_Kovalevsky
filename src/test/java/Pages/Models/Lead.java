package Pages.Models;

import Pages.Enams.*;

public class Lead {
    private LeadStatus leadStatus;
    private String phone;
    private Salutation salutation;
    private String firstName;
    private String lastName;
    private String company;
    private String email;
    private String title;
    private Rating rating;
    private String website;
    private String street;
    private String city;
    private String stateProvince;
    private String zipPostalCode;
    private String country;
    private String noOfEmployees;
    private LeadSource leadSource;
    private String annualRevenue;
    private Industry industry;
    private String description;

    public Lead(LeadStatus leadStatus, String phone, Salutation salutation, String firstName,
                String lastName, String company, String email, String title, Rating rating,
                String website, String street, String city, String stateProvince, String zipPostalCode,
                String country, String noOfEmployees, LeadSource leadSource, String annualRevenue,
                Industry industry, String description) {
        this.leadStatus = leadStatus;
        this.phone = phone;
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.email = email;
        this.title = title;
        this.rating = rating;
        this.website = website;
        this.street = street;
        this.city = city;
        this.stateProvince = stateProvince;
        this.zipPostalCode = zipPostalCode;
        this.country = country;
        this.noOfEmployees = noOfEmployees;
        this.leadSource = leadSource;
        this.annualRevenue = annualRevenue;
        this.industry = industry;
        this.description = description;
    }

    public LeadStatus getLeadStatus() {
        return leadStatus;
    }

    public String getPhone() {
        return phone;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public Rating getRating() {
        return rating;
    }

    public String getWebsite() {
        return website;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getNoOfEmployees() {
        return noOfEmployees;
    }

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public Industry getIndustry() {
        return industry;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Lead{" +
                "leadStatus=" + leadStatus +
                ", phone='" + phone + '\'' +
                ", salutation=" + salutation +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", website='" + website + '\'' +
                ", street ='" + street + '\'' +
                ", city='" + city + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                ", zipPostalCode='" + zipPostalCode + '\'' +
                ", country='" + country + '\'' +
                ", noOfEmployees='" + noOfEmployees + '\'' +
                ", leadSource=" + leadSource +
                ", annualRevenue=" + annualRevenue + '\'' +
                ", industry=" + industry +
                ", description=" + description + '}';
    }
}
