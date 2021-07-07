Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA.

The CITY table is described as follows:
CITY.jpg
________________________________________________________________________________________________________

Solution:

select  NAME from CITY where COUNTRYCODE = 'USA' and POPULATION > 120000 ;