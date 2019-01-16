# Loan-Repayment-Plan-Generator
This repo is a maven project. 
#### Application Program to Generate Loan Repayment Plan is [Here](https://github.com/malviyah/Loan-Repayment-Plan-Generator/tree/master/src/main/java/com/lendico/plangenerator/doa) 
#### This Maven project is a Web service built on Spring Boot which has one API:
##### *http://localhost:8080/api/generate-plan*
- POST request
- Payload: JSON
```json
{ 
    "loanAmount": "5000", 
    "nominalRate": "5.0", 
    "duration": 24, 
    "startDate": "2018-01-01T00:00:01Z" 
}
```
- response:
```json
[
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-01-01T00:00:01Z",
        "initialOutstandingPrincipal": 5000,
        "interestAmount": 20.83,
        "principalAmount": 198.53000000000003,
        "remainingOutstandingPrincipal": 4801.47
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-02-01T00:00:01Z",
        "initialOutstandingPrincipal": 4801.47,
        "interestAmount": 20.006125,
        "principalAmount": 199.35387500000002,
        "remainingOutstandingPrincipal": 4602.1161250000005
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-03-01T00:00:01Z",
        "initialOutstandingPrincipal": 4602.1161250000005,
        "interestAmount": 19.175483854166668,
        "principalAmount": 200.18451614583336,
        "remainingOutstandingPrincipal": 4401.931608854167
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-04-01T00:00:01Z",
        "initialOutstandingPrincipal": 4401.931608854167,
        "interestAmount": 18.341381703559033,
        "principalAmount": 201.018618296441,
        "remainingOutstandingPrincipal": 4200.9129905577265
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-05-01T00:00:01Z",
        "initialOutstandingPrincipal": 4200.9129905577265,
        "interestAmount": 17.50380412732386,
        "principalAmount": 201.85619587267615,
        "remainingOutstandingPrincipal": 3999.0567946850506
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-06-01T00:00:01Z",
        "initialOutstandingPrincipal": 3999.0567946850506,
        "interestAmount": 16.662736644521043,
        "principalAmount": 202.69726335547898,
        "remainingOutstandingPrincipal": 3796.359531329572
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-07-01T00:00:01Z",
        "initialOutstandingPrincipal": 3796.359531329572,
        "interestAmount": 15.818164713873216,
        "principalAmount": 203.5418352861268,
        "remainingOutstandingPrincipal": 3592.817696043445
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-08-01T00:00:01Z",
        "initialOutstandingPrincipal": 3592.817696043445,
        "interestAmount": 14.970073733514354,
        "principalAmount": 204.38992626648565,
        "remainingOutstandingPrincipal": 3388.4277697769594
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-09-01T00:00:01Z",
        "initialOutstandingPrincipal": 3388.4277697769594,
        "interestAmount": 14.118449040737332,
        "principalAmount": 205.24155095926267,
        "remainingOutstandingPrincipal": 3183.1862188176965
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-10-01T00:00:01Z",
        "initialOutstandingPrincipal": 3183.1862188176965,
        "interestAmount": 13.263275911740402,
        "principalAmount": 206.0967240882596,
        "remainingOutstandingPrincipal": 2977.089494729437
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-11-01T00:00:01Z",
        "initialOutstandingPrincipal": 2977.089494729437,
        "interestAmount": 12.404539561372653,
        "principalAmount": 206.95546043862737,
        "remainingOutstandingPrincipal": 2770.1340342908097
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2018-12-01T00:00:01Z",
        "initialOutstandingPrincipal": 2770.1340342908097,
        "interestAmount": 11.542225142878374,
        "principalAmount": 207.81777485712163,
        "remainingOutstandingPrincipal": 2562.316259433688
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-01-01T00:00:01Z",
        "initialOutstandingPrincipal": 2562.316259433688,
        "interestAmount": 10.676317747640368,
        "principalAmount": 208.68368225235963,
        "remainingOutstandingPrincipal": 2353.6325771813285
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-02-01T00:00:01Z",
        "initialOutstandingPrincipal": 2353.6325771813285,
        "interestAmount": 9.806802404922202,
        "principalAmount": 209.55319759507782,
        "remainingOutstandingPrincipal": 2144.0793795862505
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-03-01T00:00:01Z",
        "initialOutstandingPrincipal": 2144.0793795862505,
        "interestAmount": 8.933664081609377,
        "principalAmount": 210.42633591839063,
        "remainingOutstandingPrincipal": 1933.65304366786
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-04-01T00:00:01Z",
        "initialOutstandingPrincipal": 1933.65304366786,
        "interestAmount": 8.056887681949416,
        "principalAmount": 211.3031123180506,
        "remainingOutstandingPrincipal": 1722.3499313498094
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-05-01T00:00:01Z",
        "initialOutstandingPrincipal": 1722.3499313498094,
        "interestAmount": 7.176458047290872,
        "principalAmount": 212.18354195270913,
        "remainingOutstandingPrincipal": 1510.1663893971001
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-06-01T00:00:01Z",
        "initialOutstandingPrincipal": 1510.1663893971001,
        "interestAmount": 6.292359955821251,
        "principalAmount": 213.06764004417877,
        "remainingOutstandingPrincipal": 1297.0987493529215
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-07-01T00:00:01Z",
        "initialOutstandingPrincipal": 1297.0987493529215,
        "interestAmount": 5.40457812230384,
        "principalAmount": 213.95542187769618,
        "remainingOutstandingPrincipal": 1083.1433274752253
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-08-01T00:00:01Z",
        "initialOutstandingPrincipal": 1083.1433274752253,
        "interestAmount": 4.5130971978134395,
        "principalAmount": 214.84690280218658,
        "remainingOutstandingPrincipal": 868.2964246730387
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-09-01T00:00:01Z",
        "initialOutstandingPrincipal": 868.2964246730387,
        "interestAmount": 3.617901769470995,
        "principalAmount": 215.74209823052902,
        "remainingOutstandingPrincipal": 652.5543264425097
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-10-01T00:00:01Z",
        "initialOutstandingPrincipal": 652.5543264425097,
        "interestAmount": 2.7189763601771237,
        "principalAmount": 216.6410236398229,
        "remainingOutstandingPrincipal": 435.9133028026868
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-11-01T00:00:01Z",
        "initialOutstandingPrincipal": 435.9133028026868,
        "interestAmount": 1.8163054283445286,
        "principalAmount": 217.5436945716555,
        "remainingOutstandingPrincipal": 218.36960823103132
    },
    {
        "borrowerPaymentAmount": 219.36,
        "paymentDateString": "2019-12-01T00:00:01Z",
        "initialOutstandingPrincipal": 218.36960823103132,
        "interestAmount": 0.9098733676292972,
        "principalAmount": 218.4501266323707,
        "remainingOutstandingPrincipal": 0
    }
]
```

