package com.example.hotel_booking_system.config;

import com.example.hotel_booking_system.model.Hotel;
import com.example.hotel_booking_system.model.Reservation;
import com.example.hotel_booking_system.model.Room;
import com.example.hotel_booking_system.repository.HotelRepository;
import com.example.hotel_booking_system.repository.ReservationRepository;
import com.example.hotel_booking_system.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public void run(String... args) throws Exception {

        // Create Hotels
        Hotel hotel1 = new Hotel();
        hotel1.setName("Tivoli Hotel");
        hotel1.setStreet("Arni Magnussons Gade 2");
        hotel1.setCity("København");
        hotel1.setZip(2300);
        hotel1.setCountry("Danmark");
        hotel1.setCreated(LocalDateTime.now());
        hotel1.setUpdated(LocalDateTime.now());
        hotel1.setRoomAmount(10);

        hotelRepository.save(hotel1);

        Hotel hotel2 = new Hotel();
        hotel2.setName("Sunset Paradise Hotel");
        hotel2.setStreet("Oceanfront Avenue 123");
        hotel2.setCity("Miami");
        hotel2.setZip(33101);
        hotel2.setCountry("USA");
        hotel2.setCreated(LocalDateTime.now());
        hotel2.setUpdated(LocalDateTime.now());
        hotel2.setRoomAmount(10);

        hotelRepository.save(hotel2);

        Hotel hotel3 = new Hotel();
        hotel3.setName("Getaway Mansion");
        hotel3.setStreet("Sunset Boulevard 456");
        hotel3.setCity("Los Angeles");
        hotel3.setZip(90001);
        hotel3.setCountry("USA");
        hotel3.setCreated(LocalDateTime.now());
        hotel3.setUpdated(LocalDateTime.now());
        hotel3.setRoomAmount(10);

        hotelRepository.save(hotel3);

        Hotel hotel4 = new Hotel();
        hotel4.setName("Grand Plaza Hotel");

        hotel4.setStreet("Sunset Boulevard 456");
        hotel4.setCity("Los Angeles");
        hotel4.setZip(90001);
        hotel4.setCountry("USA");
        hotel4.setCreated(LocalDateTime.now());
        hotel4.setUpdated(LocalDateTime.now());
        hotel4.setRoomAmount(10);

        hotelRepository.save(hotel4);

        Hotel hotel5 = new Hotel();
        hotel5.setName("Cityscape Suites");
        hotel5.setStreet("Downtown Street 789");
        hotel5.setCity("New York");
        hotel5.setZip(10001);
        hotel5.setCountry("USA");
        hotel5.setCreated(LocalDateTime.now());
        hotel5.setUpdated(LocalDateTime.now());
        hotel5.setRoomAmount(10);

        hotelRepository.save(hotel5);

        Hotel hotel6 = new Hotel();
        hotel6.setName("Alpine Retreat Inn");
        hotel6.setStreet("Mountain View Road 456");
        hotel6.setCity("Aspen");
        hotel6.setZip(81611);
        hotel6.setCountry("USA");
        hotel6.setCreated(LocalDateTime.now());
        hotel6.setUpdated(LocalDateTime.now());
        hotel6.setRoomAmount(10);

        hotelRepository.save(hotel6);

        Hotel hotel7 = new Hotel();
        hotel7.setName("Seaside Oasis Hotel");
        hotel7.setStreet("Coastal Lane 123");
        hotel7.setCity("San Diego");
        hotel7.setZip(92101);
        hotel7.setCountry("USA");
        hotel7.setCreated(LocalDateTime.now());
        hotel7.setUpdated(LocalDateTime.now());
        hotel7.setRoomAmount(10);

        hotelRepository.save(hotel7);

        Hotel hotel8 = new Hotel();
        hotel8.setName("Historic Elegance Inn");
        hotel8.setStreet("Main Street 789");
        hotel8.setCity("Charleston");
        hotel8.setZip(29401);
        hotel8.setCountry("USA");
        hotel8.setCreated(LocalDateTime.now());
        hotel8.setUpdated(LocalDateTime.now());
        hotel8.setRoomAmount(10);

        hotelRepository.save(hotel8);

        Hotel hotel9 = new Hotel();
        hotel9.setName("Urban Escapes Hotel");
        hotel9.setStreet("Metropolitan Avenue 456");
        hotel9.setCity("Chicago");
        hotel9.setZip(60601);
        hotel9.setCountry("USA");
        hotel9.setCreated(LocalDateTime.now());
        hotel9.setUpdated(LocalDateTime.now());
        hotel9.setRoomAmount(10);

        hotelRepository.save(hotel9);

        Hotel hotel10 = new Hotel();
        hotel10.setName("Lakeside Bliss Resort");
        hotel10.setStreet("Lakefront Drive 123");
        hotel10.setCity("Seattle");
        hotel10.setZip(98101);
        hotel10.setCountry("USA");
        hotel10.setCreated(LocalDateTime.now());
        hotel10.setUpdated(LocalDateTime.now());
        hotel10.setRoomAmount(10);

        hotelRepository.save(hotel10);

        Hotel hotel11 = new Hotel();
        hotel11.setName("Golden Gate Hotel");
        hotel11.setStreet("Bay View Avenue 456");
        hotel11.setCity("San Francisco");
        hotel11.setZip(94101);
        hotel11.setCountry("USA");
        hotel11.setCreated(LocalDateTime.now());
        hotel11.setUpdated(LocalDateTime.now());
        hotel11.setRoomAmount(10);

        hotelRepository.save(hotel11);

        Hotel hotel12 = new Hotel();
        hotel12.setName("Majestic Heights Lodge");
        hotel12.setStreet("Summit Ridge Road 789");
        hotel12.setCity("Breckenridge");
        hotel12.setZip(80424);
        hotel12.setCountry("USA");
        hotel12.setCreated(LocalDateTime.now());
        hotel12.setUpdated(LocalDateTime.now());
        hotel12.setRoomAmount(10);

        hotelRepository.save(hotel12);

        Hotel hotel13 = new Hotel();
        hotel13.setName("Tropical Haven Resort");
        hotel13.setStreet("Palm Tree Lane 123");
        hotel13.setCity("Miami");
        hotel13.setZip(33101);
        hotel13.setCountry("USA");
        hotel13.setCreated(LocalDateTime.now());
        hotel13.setUpdated(LocalDateTime.now());
        hotel13.setRoomAmount(10);

        hotelRepository.save(hotel13);

        Hotel hotel14 = new Hotel();
        hotel14.setName("Rustic Retreat Inn");
        hotel14.setStreet("Countryside Road 456");
        hotel14.setCity("Nashville");
        hotel14.setZip(37201);
        hotel14.setCountry("USA");
        hotel14.setCreated(LocalDateTime.now());
        hotel14.setUpdated(LocalDateTime.now());
        hotel14.setRoomAmount(10);

        hotelRepository.save(hotel14);

        Hotel hotel15 = new Hotel();
        hotel15.setName("Harbor Lights Hotel");
        hotel15.setStreet("Marina Drive 789");
        hotel15.setCity("Annapolis");
        hotel15.setZip(21401);
        hotel15.setCountry("USA");
        hotel15.setCreated(LocalDateTime.now());
        hotel15.setUpdated(LocalDateTime.now());
        hotel15.setRoomAmount(10);

        hotelRepository.save(hotel15);

        Hotel hotel16 = new Hotel();
        hotel16.setName("Countryside Comfort Inn");
        hotel16.setStreet("Meadow Lane 123");
        hotel16.setCity("Dallas");
        hotel16.setZip(75201);
        hotel16.setCountry("USA");
        hotel16.setCreated(LocalDateTime.now());
        hotel16.setUpdated(LocalDateTime.now());
        hotel16.setRoomAmount(10);

        hotelRepository.save(hotel16);

        Hotel hotel17 = new Hotel();
        hotel17.setName("Grand Plaza Hotel");
        hotel17.setStreet("City Center Avenue 456");
        hotel17.setCity("Las Vegas");
        hotel17.setZip(89101);
        hotel17.setCountry("USA");
        hotel17.setCreated(LocalDateTime.now());
        hotel17.setUpdated(LocalDateTime.now());
        hotel17.setRoomAmount(10);

        hotelRepository.save(hotel17);

        Hotel hotel18 = new Hotel();
        hotel18.setName("Victorian Charm Inn");
        hotel18.setStreet("Garden Street 789");
        hotel18.setCity("Savannah");
        hotel18.setZip(31401);
        hotel18.setCountry("USA");
        hotel18.setCreated(LocalDateTime.now());
        hotel18.setUpdated(LocalDateTime.now());
        hotel18.setRoomAmount(10);

        hotelRepository.save(hotel18);

        Hotel hotel19 = new Hotel();
        hotel19.setName("Skyline Views Hotel");
        hotel19.setStreet("Highway 101 123");
        hotel19.setCity("San Diego");
        hotel19.setZip(92101);
        hotel19.setCountry("USA");
        hotel19.setCreated(LocalDateTime.now());
        hotel19.setUpdated(LocalDateTime.now());
        hotel19.setRoomAmount(10);

        hotelRepository.save(hotel19);

        Hotel hotel20 = new Hotel();
        hotel20.setName("Enchanted Gardens Resort");
        hotel20.setStreet("Floral Lane 456");
        hotel20.setCity("Portland");
        hotel20.setZip(97201);
        hotel20.setCountry("USA");
        hotel20.setCreated(LocalDateTime.now());
        hotel20.setUpdated(LocalDateTime.now());
        hotel20.setRoomAmount(10);

        hotelRepository.save(hotel20);

        Hotel hotel21 = new Hotel();
        hotel21.setName("Alpine Retreat Lodge");
        hotel21.setStreet("Mountain View Road 123");
        hotel21.setCity("Zermatt");
        hotel21.setZip(3920);
        hotel21.setCountry("Switzerland");
        hotel21.setCreated(LocalDateTime.now());
        hotel21.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel21);

        Hotel hotel22 = new Hotel();
        hotel22.setName("Canal View Hotel");
        hotel22.setStreet("Waterfront Avenue 456");
        hotel22.setCity("Amsterdam");
        hotel22.setZip(1012);
        hotel22.setCountry("Netherlands");
        hotel22.setCreated(LocalDateTime.now());
        hotel22.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel22);

        Hotel hotel23 = new Hotel();
        hotel23.setName("Outback Oasis Resort");
        hotel23.setStreet("Desert Drive 789");
        hotel23.setCity("Alice Springs");
        hotel23.setZip(870);
        hotel23.setCountry("Australia");
        hotel23.setCreated(LocalDateTime.now());
        hotel23.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel23);

        Hotel hotel24 = new Hotel();
        hotel24.setName("Mediterranean Bliss Inn");
        hotel24.setStreet("Coastal Avenue 123");
        hotel24.setCity("Athens");
        hotel24.setZip(11745);
        hotel24.setCountry("Greece");
        hotel24.setCreated(LocalDateTime.now());
        hotel24.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel24);

        Hotel hotel25 = new Hotel();
        hotel25.setName("Safari Serenity Lodge");
        hotel25.setStreet("Savanna Road 456");
        hotel25.setCity("Nairobi");
        hotel25.setZip(00100);
        hotel25.setCountry("Kenya");
        hotel25.setCreated(LocalDateTime.now());
        hotel25.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel25);

        Hotel hotel26 = new Hotel();
        hotel26.setName("Boreal Escape Hotel");
        hotel26.setStreet("Northern Lights Lane 789");
        hotel26.setCity("Reykjavik");
        hotel26.setZip(101);
        hotel26.setCountry("Iceland");
        hotel26.setCreated(LocalDateTime.now());
        hotel26.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel26);

        Hotel hotel27 = new Hotel();
        hotel27.setName("Panoramic Peaks Lodge");
        hotel27.setStreet("Mountain Range Avenue 123");
        hotel27.setCity("Vancouver");
        hotel27.setZip(66548);
        hotel27.setCountry("Canada");
        hotel27.setCreated(LocalDateTime.now());
        hotel27.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel27);

        Hotel hotel28 = new Hotel();
        hotel28.setName("Bollywood Dreams Resort");
        hotel28.setStreet("Film City Road 456");
        hotel28.setCity("Mumbai");
        hotel28.setZip(400065);
        hotel28.setCountry("India");
        hotel28.setCreated(LocalDateTime.now());
        hotel28.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel28);

        Hotel hotel29 = new Hotel();
        hotel29.setName("Eternal Fjords Inn");
        hotel29.setStreet("Fjord View Drive 789");
        hotel29.setCity("Oslo");
        hotel29.setZip(0150);
        hotel29.setCountry("Norway");
        hotel29.setCreated(LocalDateTime.now());
        hotel29.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel29);

        Hotel hotel30 = new Hotel();
        hotel30.setName("African Sunset Lodge");
        hotel30.setStreet("Sahara Avenue 123");
        hotel30.setCity("Cape Town");
        hotel30.setZip(8001);
        hotel30.setCountry("South Africa");
        hotel30.setCreated(LocalDateTime.now());
        hotel30.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel30);

        Hotel hotel31 = new Hotel();
        hotel31.setName("Nordic Aurora Hotel");
        hotel31.setStreet("Aurora Lane 123");
        hotel31.setCity("Tromsø");
        hotel31.setZip(9008);
        hotel31.setCountry("Norway");
        hotel31.setCreated(LocalDateTime.now());
        hotel31.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel31);

        Hotel hotel32 = new Hotel();
        hotel32.setName("Seaside Bliss Resort");
        hotel32.setStreet("Oceanfront Drive 456");
        hotel32.setCity("Sydney");
        hotel32.setZip(2000);
        hotel32.setCountry("Australia");
        hotel32.setCreated(LocalDateTime.now());
        hotel32.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel32);

        Hotel hotel33 = new Hotel();
        hotel33.setName("Swiss Chalet Retreat");
        hotel33.setStreet("Alpine View Road 789");
        hotel33.setCity("Lucerne");
        hotel33.setZip(6003);
        hotel33.setCountry("Switzerland");
        hotel33.setCreated(LocalDateTime.now());
        hotel33.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel33);

        Hotel hotel34 = new Hotel();
        hotel34.setName("City Lights Hotel");
        hotel34.setStreet("Metropolis Street 123");
        hotel34.setCity("New York");
        hotel34.setZip(10001);
        hotel34.setCountry("USA");
        hotel34.setCreated(LocalDateTime.now());
        hotel34.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel34);

        Hotel hotel35 = new Hotel();
        hotel35.setName("Zen Garden Retreat");
        hotel35.setStreet("Tranquil Lane 456");
        hotel35.setCity("Kyoto");
        hotel35.setZip(605-0073);
        hotel35.setCountry("Japan");
        hotel35.setCreated(LocalDateTime.now());
        hotel35.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel35);

        Hotel hotel36 = new Hotel();
        hotel36.setName("Caribbean Breeze Resort");
        hotel36.setStreet("Palm Tree Avenue 789");
        hotel36.setCity("Nassau");
        hotel36.setZip(5018);
        hotel36.setCountry("Bahamas");
        hotel36.setCreated(LocalDateTime.now());
        hotel36.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel36);

        Hotel hotel37 = new Hotel();
        hotel37.setName("Venetian Elegance Hotel");
        hotel37.setStreet("Canal Side Drive 123");
        hotel37.setCity("Venice");
        hotel37.setZip(30100);
        hotel37.setCountry("Italy");
        hotel37.setCreated(LocalDateTime.now());
        hotel37.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel37);

        Hotel hotel38 = new Hotel();
        hotel38.setName("Golden Sands Resort");
        hotel38.setStreet("Beachfront Road 456");
        hotel38.setCity("Dubai");
        hotel38.setZip(12345);
        hotel38.setCountry("United Arab Emirates");
        hotel38.setCreated(LocalDateTime.now());
        hotel38.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel38);

        Hotel hotel39 = new Hotel();
        hotel39.setName("Mystic Mountains Lodge");
        hotel39.setStreet("Summit View Drive 789");
        hotel39.setCity("Banff");
        hotel39.setZip(3113);
        hotel39.setCountry("Canada");
        hotel39.setCreated(LocalDateTime.now());
        hotel39.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel39);

        Hotel hotel40 = new Hotel();
        hotel40.setName("Riviera Retreat Hotel");
        hotel40.setStreet("Coastline Avenue 123");
        hotel40.setCity("Nice");
        hotel40.setZip(06000);
        hotel40.setCountry("France");
        hotel40.setCreated(LocalDateTime.now());
        hotel40.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel40);

        Hotel hotel41 = new Hotel();
        hotel41.setName("Andean Heights Lodge");
        hotel41.setStreet("Mountain Range Road 456");
        hotel41.setCity("Cusco");
        hotel41.setZip(802);
        hotel41.setCountry("Peru");
        hotel41.setCreated(LocalDateTime.now());
        hotel41.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel41);

        Hotel hotel42 = new Hotel();
        hotel42.setName("Silicon Valley Inn");
        hotel42.setStreet("Tech Hub Street 789");
        hotel42.setCity("San Francisco");
        hotel42.setZip(94105);
        hotel42.setCountry("USA");
        hotel42.setCreated(LocalDateTime.now());
        hotel42.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel42);

        Hotel hotel43 = new Hotel();
        hotel43.setName("Mayan Ruins Resort");
        hotel43.setStreet("Ancient Pathway 123");
        hotel43.setCity("Tulum");
        hotel43.setZip(77780);
        hotel43.setCountry("Mexico");
        hotel43.setCreated(LocalDateTime.now());
        hotel43.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel43);

        Hotel hotel44 = new Hotel();
        hotel44.setName("Bavarian Charm Hotel");
        hotel44.setStreet("Alps View Road 456");
        hotel44.setCity("Munich");
        hotel44.setZip(80331);
        hotel44.setCountry("Germany");
        hotel44.setCreated(LocalDateTime.now());
        hotel44.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel44);

        Hotel hotel45 = new Hotel();
        hotel45.setName("Aloha Spirit Resort");
        hotel45.setStreet("Hawaiian Paradise Drive 789");
        hotel45.setCity("Honolulu");
        hotel45.setZip(96815);
        hotel45.setCountry("USA");
        hotel45.setCreated(LocalDateTime.now());
        hotel45.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel45);

        Hotel hotel46 = new Hotel();
        hotel46.setName("Grand Canal Hotel");
        hotel46.setStreet("Waterway Lane 123");
        hotel46.setCity("Dublin");
        hotel46.setZip(02567);
        hotel46.setCountry("Ireland");
        hotel46.setCreated(LocalDateTime.now());
        hotel46.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel46);

        Hotel hotel47 = new Hotel();
        hotel47.setName("Red Square Retreat");
        hotel47.setStreet("Kremlin View Road 456");
        hotel47.setCity("Moscow");
        hotel47.setZip(101000);
        hotel47.setCountry("Russia");
        hotel47.setCreated(LocalDateTime.now());
        hotel47.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel47);

        Hotel hotel48 = new Hotel();
        hotel48.setName("Balinese Bliss Resort");
        hotel48.setStreet("Tropical Paradise Drive 789");
        hotel48.setCity("Ubud");
        hotel48.setZip(80571);
        hotel48.setCountry("Indonesia");
        hotel48.setCreated(LocalDateTime.now());
        hotel48.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel48);

        Hotel hotel49 = new Hotel();
        hotel49.setName("Arctic Circle Lodge");
        hotel49.setStreet("Polar Bear Lane 123");
        hotel49.setCity("Rovaniemi");
        hotel49.setZip(96100);
        hotel49.setCountry("Finland");
        hotel49.setCreated(LocalDateTime.now());
        hotel49.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel49);

        Hotel hotel50 = new Hotel();
        hotel50.setName("Taj Mahal Palace");
        hotel50.setStreet("Heritage View Road 456");
        hotel50.setCity("Mumbai");
        hotel50.setZip(400001);
        hotel50.setCountry("India");
        hotel50.setCreated(LocalDateTime.now());
        hotel50.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel50);

        Hotel hotel51 = new Hotel();
        hotel51.setName("Eternal Springs Resort");
        hotel51.setStreet("Blossom Lane 123");
        hotel51.setCity("Seoul");
        hotel51.setZip(04536);
        hotel51.setCountry("South Korea");
        hotel51.setCreated(LocalDateTime.now());
        hotel51.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel51);

        Hotel hotel52 = new Hotel();
        hotel52.setName("Alpine Retreat Chalet");
        hotel52.setStreet("Snowy Peaks Road 456");
        hotel52.setCity("Innsbruck");
        hotel52.setZip(6020);
        hotel52.setCountry("Austria");
        hotel52.setCreated(LocalDateTime.now());
        hotel52.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel52);

        Hotel hotel53 = new Hotel();
        hotel53.setName("Safari Serenity Lodge");
        hotel53.setStreet("Savannah Drive 789");
        hotel53.setCity("Maasai Mara");
        hotel53.setZip(00100);
        hotel53.setCountry("Kenya");
        hotel53.setCreated(LocalDateTime.now());
        hotel53.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel53);

        Hotel hotel54 = new Hotel();
        hotel54.setName("Icelandic Aurora Hotel");
        hotel54.setStreet("Northern Lights Lane 123");
        hotel54.setCity("Reykjavik");
        hotel54.setZip(101);
        hotel54.setCountry("Iceland");
        hotel54.setCreated(LocalDateTime.now());
        hotel54.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel54);

        Hotel hotel55 = new Hotel();
        hotel55.setName("Amazon Rainforest Retreat");
        hotel55.setStreet("Canopy Trail 456");
        hotel55.setCity("Manaus");
        hotel55.setZip(69010120);
        hotel55.setCountry("Brazil");
        hotel55.setCreated(LocalDateTime.now());
        hotel55.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel55);

        Hotel hotel56 = new Hotel();
        hotel56.setName("Marrakech Oasis Resort");
        hotel56.setStreet("Desert Rose Road 789");
        hotel56.setCity("Marrakech");
        hotel56.setZip(40000);
        hotel56.setCountry("Morocco");
        hotel56.setCreated(LocalDateTime.now());
        hotel56.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel56);

        Hotel hotel57 = new Hotel();
        hotel57.setName("Himalayan Peaks Lodge");
        hotel57.setStreet("Mountain Summit Drive 123");
        hotel57.setCity("Kathmandu");
        hotel57.setZip(44600);
        hotel57.setCountry("Nepal");
        hotel57.setCreated(LocalDateTime.now());
        hotel57.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel57);

        Hotel hotel58 = new Hotel();
        hotel58.setName("Bora Bora Bliss Resort");
        hotel58.setStreet("Overwater Bungalow 456");
        hotel58.setCity("Bora Bora");
        hotel58.setZip(98730);
        hotel58.setCountry("French Polynesia");
        hotel58.setCreated(LocalDateTime.now());
        hotel58.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel58);

        Hotel hotel59 = new Hotel();
        hotel59.setName("Edinburgh Castle Hotel");
        hotel59.setStreet("Royal Mile 789");
        hotel59.setCity("Edinburgh");
        hotel59.setZip(234342);
        hotel59.setCountry("Scotland");
        hotel59.setCreated(LocalDateTime.now());
        hotel59.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel59);

        Hotel hotel60 = new Hotel();
        hotel60.setName("Cape Town Seaside Retreat");
        hotel60.setStreet("Clifton Beach 123");
        hotel60.setCity("Cape Town");
        hotel60.setZip(8005);
        hotel60.setCountry("South Africa");
        hotel60.setCreated(LocalDateTime.now());
        hotel60.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel60);

        Hotel hotel61 = new Hotel();
        hotel61.setName("Fiji Paradise Resort");
        hotel61.setStreet("Palm Cove 456");
        hotel61.setCity("Nadi");
        hotel61.setZip(67965);
        hotel61.setCountry("Fiji");
        hotel61.setCreated(LocalDateTime.now());
        hotel61.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel61);

        Hotel hotel62 = new Hotel();
        hotel62.setName("Barcelona Gaudi Hotel");
        hotel62.setStreet("Modernist Avenue 789");
        hotel62.setCity("Barcelona");
        hotel62.setZip(82138);
        hotel62.setCountry("Spain");
        hotel62.setCreated(LocalDateTime.now());
        hotel62.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel62);

        Hotel hotel63 = new Hotel();
        hotel63.setName("Dubrovnik Coastal Retreat");
        hotel63.setStreet("Adriatic View Drive 123");
        hotel63.setCity("Dubrovnik");
        hotel63.setZip(20000);
        hotel63.setCountry("Croatia");
        hotel63.setCreated(LocalDateTime.now());
        hotel63.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel63);

        Hotel hotel64 = new Hotel();
        hotel64.setName("Great Wall View Hotel");
        hotel64.setStreet("Ancient Wall Lane 456");
        hotel64.setCity("Beijing");
        hotel64.setZip(100005);
        hotel64.setCountry("China");
        hotel64.setCreated(LocalDateTime.now());
        hotel64.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel64);

        Hotel hotel65 = new Hotel();
        hotel65.setName("Montreal Jazz Hotel");
        hotel65.setStreet("Jazz Festival Square 789");
        hotel65.setCity("Montreal");
        hotel65.setZip(265617);
        hotel65.setCountry("Canada");
        hotel65.setCreated(LocalDateTime.now());
        hotel65.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel65);

        Hotel hotel66 = new Hotel();
        hotel66.setName("Maui Sunset Resort");
        hotel66.setStreet("Oceanfront Paradise Drive 123");
        hotel66.setCity("Kihei");
        hotel66.setZip(96753);
        hotel66.setCountry("USA");
        hotel66.setCreated(LocalDateTime.now());
        hotel66.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel66);

        Hotel hotel67 = new Hotel();
        hotel67.setName("Prague Castle Hotel");
        hotel67.setStreet("Castle Hill 456");
        hotel67.setCity("Prague");
        hotel67.setZip(11908);
        hotel67.setCountry("Czech Republic");
        hotel67.setCreated(LocalDateTime.now());
        hotel67.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel67);

        Hotel hotel68 = new Hotel();
        hotel68.setName("Eiffel Tower View Hotel");
        hotel68.setStreet("Champs de Mars 789");
        hotel68.setCity("Paris");
        hotel68.setZip(75007);
        hotel68.setCountry("France");
        hotel68.setCreated(LocalDateTime.now());
        hotel68.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel68);

        Hotel hotel69 = new Hotel();
        hotel69.setName("Dubai Skyline Suites");
        hotel69.setStreet("Sheikh Zayed Road 123");
        hotel69.setCity("Dubai");
        hotel69.setZip(12345);
        hotel69.setCountry("UAE");
        hotel69.setCreated(LocalDateTime.now());
        hotel69.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel69);

        Hotel hotel70 = new Hotel();
        hotel70.setName("Tokyo Sakura Ryokan");
        hotel70.setStreet("Cherry Blossom Lane 456");
        hotel70.setCity("Tokyo");
        hotel70.setZip(10087);
        hotel70.setCountry("Japan");
        hotel70.setCreated(LocalDateTime.now());
        hotel70.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel70);

        Hotel hotel71 = new Hotel();
        hotel71.setName("Mystic Santorini Retreat");
        hotel71.setStreet("Caldera Cliff 123");
        hotel71.setCity("Santorini");
        hotel71.setZip(84700);
        hotel71.setCountry("Greece");
        hotel71.setCreated(LocalDateTime.now());
        hotel71.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel71);

        Hotel hotel72 = new Hotel();
        hotel72.setName("Toronto Skyline View Hotel");
        hotel72.setStreet("CN Tower Avenue 456");
        hotel72.setCity("Toronto");
        hotel72.setZip(526);
        hotel72.setCountry("Canada");
        hotel72.setCreated(LocalDateTime.now());
        hotel72.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel72);

        Hotel hotel73 = new Hotel();
        hotel73.setName("Amsterdam Canal House");
        hotel73.setStreet("Keizersgracht 789");
        hotel73.setCity("Amsterdam");
        hotel73.setZip(1015);
        hotel73.setCountry("Netherlands");
        hotel73.setCreated(LocalDateTime.now());
        hotel73.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel73);

        Hotel hotel74 = new Hotel();
        hotel74.setName("Sydney Opera House Hotel");
        hotel74.setStreet("Harbourfront Drive 123");
        hotel74.setCity("Sydney");
        hotel74.setZip(2000);
        hotel74.setCountry("Australia");
        hotel74.setCreated(LocalDateTime.now());
        hotel74.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel74);

        Hotel hotel75 = new Hotel();
        hotel75.setName("Cancun Beachfront Resort");
        hotel75.setStreet("Caribbean Shore 456");
        hotel75.setCity("Cancun");
        hotel75.setZip(77500);
        hotel75.setCountry("Mexico");
        hotel75.setCreated(LocalDateTime.now());
        hotel75.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel75);

        Hotel hotel76 = new Hotel();
        hotel76.setName("Munich Beer Garden Inn");
        hotel76.setStreet("Bavarian Bierstrasse 789");
        hotel76.setCity("Munich");
        hotel76.setZip(80331);
        hotel76.setCountry("Germany");
        hotel76.setCreated(LocalDateTime.now());
        hotel76.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel76);

        Hotel hotel77 = new Hotel();
        hotel77.setName("Rio de Janeiro Carnival Hotel");
        hotel77.setStreet("Samba Street 123");
        hotel77.setCity("Rio de Janeiro");
        hotel77.setZip(2004);
        hotel77.setCountry("Brazil");
        hotel77.setCreated(LocalDateTime.now());
        hotel77.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel77);

        Hotel hotel78 = new Hotel();
        hotel78.setName("Swiss Alps Chalet");
        hotel78.setStreet("Alpine Meadow 456");
        hotel78.setCity("Zermatt");
        hotel78.setZip(3920);
        hotel78.setCountry("Switzerland");
        hotel78.setCreated(LocalDateTime.now());
        hotel78.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel78);

        Hotel hotel79 = new Hotel();
        hotel79.setName("Marrakesh Medina Riad");
        hotel79.setStreet("Souk Lane 789");
        hotel79.setCity("Marrakesh");
        hotel79.setZip(40000);
        hotel79.setCountry("Morocco");
        hotel79.setCreated(LocalDateTime.now());
        hotel79.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel79);

        Hotel hotel80 = new Hotel();
        hotel80.setName("Vienna Imperial Palace");
        hotel80.setStreet("Hofburg Ring 123");
        hotel80.setCity("Vienna");
        hotel80.setZip(1010);
        hotel80.setCountry("Austria");
        hotel80.setCreated(LocalDateTime.now());
        hotel80.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel80);

        Hotel hotel81 = new Hotel();
        hotel81.setName("Maldives Overwater Bungalow");
        hotel81.setStreet("Lagoon Villa 456");
        hotel81.setCity("Malé");
        hotel81.setZip(20010);
        hotel81.setCountry("Maldives");
        hotel81.setCreated(LocalDateTime.now());
        hotel81.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel81);

        Hotel hotel82 = new Hotel();
        hotel82.setName("New York Times Square Hotel");
        hotel82.setStreet("Broadway Avenue 789");
        hotel82.setCity("New York");
        hotel82.setZip(10036);
        hotel82.setCountry("USA");
        hotel82.setCreated(LocalDateTime.now());
        hotel82.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel82);

        Hotel hotel83 = new Hotel();
        hotel83.setName("Barcelona Beachfront Resort");
        hotel83.setStreet("Golden Sand 123");
        hotel83.setCity("Barcelona");
        hotel83.setZip(708039);
        hotel83.setCountry("Spain");
        hotel83.setCreated(LocalDateTime.now());
        hotel83.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel83);

        Hotel hotel84 = new Hotel();
        hotel84.setName("Prague Astronomical Hotel");
        hotel84.setStreet("Stargazer Lane 456");
        hotel84.setCity("Prague");
        hotel84.setZip(1107);
        hotel84.setCountry("Czech Republic");
        hotel84.setCreated(LocalDateTime.now());
        hotel84.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel84);

        Hotel hotel85 = new Hotel();
        hotel85.setName("Edinburgh Highlands Lodge");
        hotel85.setStreet("Loch View 789");
        hotel85.setCity("Edinburgh");
        hotel85.setZip(1176);
        hotel85.setCountry("Scotland");
        hotel85.setCreated(LocalDateTime.now());
        hotel85.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel85);

        Hotel hotel86 = new Hotel();
        hotel86.setName("Tokyo Imperial Gardens Hotel");
        hotel86.setStreet("Cherry Blossom Avenue 123");
        hotel86.setCity("Tokyo");
        hotel86.setZip(1008111);
        hotel86.setCountry("Japan");
        hotel86.setCreated(LocalDateTime.now());
        hotel86.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel86);

        Hotel hotel87 = new Hotel();
        hotel87.setName("Dubrovnik Old Town Residence");
        hotel87.setStreet("Castle Street 456");
        hotel87.setCity("Dubrovnik");
        hotel87.setZip(20000);
        hotel87.setCountry("Croatia");
        hotel87.setCreated(LocalDateTime.now());
        hotel87.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel87);

        Hotel hotel88 = new Hotel();
        hotel88.setName("Singapore Marina Bay View");
        hotel88.setStreet("Bayfront Avenue 789");
        hotel88.setCity("Singapore");
        hotel88.setZip(1856);
        hotel88.setCountry("Singapore");
        hotel88.setCreated(LocalDateTime.now());
        hotel88.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel88);

        Hotel hotel89 = new Hotel();
        hotel89.setName("Istanbul Bosphorus Palace");
        hotel89.setStreet("Palace View 123");
        hotel89.setCity("Istanbul");
        hotel89.setZip(34470);
        hotel89.setCountry("Turkey");
        hotel89.setCreated(LocalDateTime.now());
        hotel89.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel89);

        Hotel hotel90 = new Hotel();
        hotel90.setName("Rome Colosseum Suites");
        hotel90.setStreet("Gladiator Road 456");
        hotel90.setCity("Rome");
        hotel90.setZip(1584);
        hotel90.setCountry("Italy");
        hotel90.setCreated(LocalDateTime.now());
        hotel90.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel90);

        Hotel hotel91 = new Hotel();
        hotel91.setName("Montreal Mount Royal Retreat");
        hotel91.setStreet("Summit Avenue 123");
        hotel91.setCity("Montreal");
        hotel91.setZip(3435);
        hotel91.setCountry("Canada");
        hotel91.setCreated(LocalDateTime.now());
        hotel91.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel91);

        Hotel hotel92 = new Hotel();
        hotel92.setName("Seoul Han River View Hotel");
        hotel92.setStreet("Hangangro 456");
        hotel92.setCity("Seoul");
        hotel92.setZip(4531);
        hotel92.setCountry("South Korea");
        hotel92.setCreated(LocalDateTime.now());
        hotel92.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel92);

        Hotel hotel93 = new Hotel();
        hotel93.setName("Budapest Thermal Bath Resort");
        hotel93.setStreet("Gellert Hill 789");
        hotel93.setCity("Budapest");
        hotel93.setZip(1111);
        hotel93.setCountry("Hungary");
        hotel93.setCreated(LocalDateTime.now());
        hotel93.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel93);

        Hotel hotel94 = new Hotel();
        hotel94.setName("Dubai Desert Oasis Hotel");
        hotel94.setStreet("Arabian Dunes 123");
        hotel94.setCity("Dubai");
        hotel94.setZip( 123456 );
        hotel94.setCountry("United Arab Emirates");
        hotel94.setCreated(LocalDateTime.now());
        hotel94.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel94);

        Hotel hotel95 = new Hotel();
        hotel95.setName("Buenos Aires Tango Plaza Hotel");
        hotel95.setStreet("Avenida Corrientes 456");
        hotel95.setCity("Buenos Aires");
        hotel95.setZip(1235);
        hotel95.setCountry("Argentina");
        hotel95.setCreated(LocalDateTime.now());
        hotel95.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel95);

        Hotel hotel96 = new Hotel();
        hotel96.setName("Zurich Lakeside Retreat");
        hotel96.setStreet("Lake Promenade 789");
        hotel96.setCity("Zurich");
        hotel96.setZip(8001);
        hotel96.setCountry("Switzerland");
        hotel96.setCreated(LocalDateTime.now());
        hotel96.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel96);

        Hotel hotel97 = new Hotel();
        hotel97.setName("Cairo Nile View Hotel");
        hotel97.setStreet("Nile Corniche 123");
        hotel97.setCity("Cairo");
        hotel97.setZip(11511);
        hotel97.setCountry("Egypt");
        hotel97.setCreated(LocalDateTime.now());
        hotel97.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel97);

        Hotel hotel98 = new Hotel();
        hotel98.setName("Vancouver Coastal Retreat");
        hotel98.setStreet("Pacific Shore 456");
        hotel98.setCity("Vancouver");
        hotel98.setZip(21334);
        hotel98.setCountry("Canada");
        hotel98.setCreated(LocalDateTime.now());
        hotel98.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel98);

        Hotel hotel99 = new Hotel();
        hotel99.setName("Mumbai Bollywood Suites");
        hotel99.setStreet("Film City Road 789");
        hotel99.setCity("Mumbai");
        hotel99.setZip(400097);
        hotel99.setCountry("India");
        hotel99.setCreated(LocalDateTime.now());
        hotel99.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel99);

        Hotel hotel100 = new Hotel();
        hotel100.setName("Stockholm Archipelago Resort");
        hotel100.setStreet("Island Haven 123");
        hotel100.setCity("Stockholm");
        hotel100.setZip( 11120 );
        hotel100.setCountry("Sweden");
        hotel100.setCreated(LocalDateTime.now());
        hotel100.setUpdated(LocalDateTime.now());

        hotelRepository.save(hotel100);


        // Create Reservations
        Reservation reservation1 = new Reservation();
        reservation1.setReservationDate(LocalDate.parse("10-10-2010", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        reservation1.setCreated(LocalDateTime.now());
        reservation1.setUpdated(LocalDateTime.now());

        reservationRepository.save(reservation1);

        // Create Rooms
        Room room1 = new Room();
        room1.setRoomNumber(1);
        room1.setNumberOfBeds(2);
        room1.setPrice(60.05);
        room1.setIsAvailable(0);
        room1.setCreated(LocalDateTime.now());
        room1.setUpdated(LocalDateTime.now());
        room1.setReservationList(Arrays.asList(reservation1));
        room1.setHotel(hotel1);

        roomRepository.save(room1);
    }
}
