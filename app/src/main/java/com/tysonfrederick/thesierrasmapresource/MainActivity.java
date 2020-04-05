package com.tysonfrederick.thesierrasmapresource;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {


    GoogleMap m_map;
    boolean mapReady=false;

    MarkerOptions lakeTahoeCommunity;
    MarkerOptions westernNevada;
    MarkerOptions truckeeMeadowsCommunity;
    MarkerOptions nevadaReno;
    MarkerOptions nevadaLasVegas;
    MarkerOptions sierraNevada;
    MarkerOptions tramwayRock;
    MarkerOptions berkeleyCampRock;
    MarkerOptions monumentPeak;
    MarkerOptions tallacPeak;
    MarkerOptions castleRock;
    MarkerOptions spoonerCragRock;
    MarkerOptions lizardRock;
    MarkerOptions rimTrailBenchMarker;
    MarkerOptions zephyrDisc;
    MarkerOptions bijouDisc;
    MarkerOptions loversLeapRock;
    MarkerOptions hogsbackRock;
    MarkerOptions maryannRock;

    LatLng castleLatLng = new LatLng(38.9894699,-119.910887);
    LatLng spoonerLatLng = new LatLng(39.100184,-119.9146552);
    LatLng loversLatLng = new LatLng(38.799444,-120.1377447);


    static final CameraPosition LAKETAHOE = CameraPosition.builder()
            .target(new LatLng(39.040151,-120.041465))
            .zoom(10)
            .bearing(0)
            .tilt(45)
            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        zephyrDisc = new MarkerOptions()
                .position(new LatLng(39.010139,-119.945436))
                .title("Zephyr Cove Disc Course");

        bijouDisc = new MarkerOptions()
                .position(new LatLng(38.932145,-119.9685332))
                .title("Bijou Disc Course");

        loversLeapRock = new MarkerOptions()
                .position(new LatLng(38.799444,-120.1377447))
                .title("Lover's Leap");

        hogsbackRock = new MarkerOptions()
                .position(new LatLng(38.800353,-120.1368222))
                .title("Hogsback");

        maryannRock = new MarkerOptions()
                .position(new LatLng(38.986668,-119.899632))
                .title("Maryann Crag");


        tramwayRock = new MarkerOptions()
                .position(new LatLng(38.972188,-119.8867362))
                .title("Tramway Rock");

        berkeleyCampRock = new MarkerOptions()
                .position(new LatLng(38.832085,-120.0379613))
                .title("Berkeley Camp");

        monumentPeak = new MarkerOptions()
                .position(new LatLng(38.9250057,-119.9021491))
                .title("Monument Peak");

        tallacPeak = new MarkerOptions()
                .position(new LatLng(38.9061482,-120.0998482))
                .title("Mount Tallac");

        spoonerCragRock = new MarkerOptions()
                .position(new LatLng(39.100184,-119.9146552))
                .title("Spooner Crag");

        lizardRock = new MarkerOptions()
                .position(new LatLng(38.979305,-119.9068292))
                .title("Lizard Rock");

        rimTrailBenchMarker = new MarkerOptions()
                .position(new LatLng(39.05113,-119.8919832))
                .title("Tahoe Rim Trail");

        castleRock = new MarkerOptions()
                .position(new LatLng(38.9894699,-119.910887))
                .title("Castle Rock");

        lakeTahoeCommunity = new MarkerOptions()
                .position(new LatLng(38.9267072,-119.9737834))
                .title("Lake Tahoe Community College");

        westernNevada = new MarkerOptions()
                .position(new LatLng(39.1860227,-119.7931977))
                .title("Western Nevada College");

        truckeeMeadowsCommunity = new MarkerOptions()
                .position(new LatLng(39.571054,-119.7997527))
                .title("Truckee Meadows Community College");

        nevadaReno = new MarkerOptions()
                .position(new LatLng(39.5441917,-119.8185857))
                .title("University of Nevada, Reno");

        nevadaLasVegas = new MarkerOptions()
                .position(new LatLng(36.107043,-115.1445636))
                .title("University of Nevada, Las Vegas");

        sierraNevada = new MarkerOptions()
                .position(new LatLng(39.244983,-119.9397627))
                .title("Sierra Nevada College");


        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

        /*        Button btnMap = (Button) findViewById(R.id.btnMap);
        btnMap.setOnClickListener ((v)  --> {
                if(mapReady)
                    m_map.setMapType((GoogleMap.MAP_TYPE_NORMAL);

        });

        Button btnSat = (Button) findViewById(R.id.btnMap);
        btnMap.setOnClickListener ((v)  --> {
        if(mapReady)
            m_map.setMapType((GoogleMap.MAP_TYPE_NORMAL);

        });

        Button btnMap = (Button) findViewById(R.id.btnMap);
        btnMap.setOnClickListener ((v)  --> {
        if(mapReady)
            m_map.setMapType((GoogleMap.MAP_TYPE_NORMAL);

        });*/



    @Override
    public void onMapReady(GoogleMap map) {
        mapReady=true;
        m_map = map;
        m_map.addMarker(lakeTahoeCommunity);
        m_map.addMarker(westernNevada);
        m_map.addMarker(truckeeMeadowsCommunity);
        m_map.addMarker(nevadaReno);
        m_map.addMarker(nevadaLasVegas);
        m_map.addMarker(sierraNevada);

        m_map.addMarker(tramwayRock);
        m_map.addMarker(berkeleyCampRock);
        m_map.addMarker(monumentPeak);
        m_map.addMarker(tallacPeak);
        m_map.addMarker(castleRock);
        m_map.addMarker(spoonerCragRock);
        m_map.addMarker(lizardRock);
        m_map.addMarker(rimTrailBenchMarker);
        m_map.addMarker(zephyrDisc);
        m_map.addMarker(bijouDisc);
        m_map.addMarker(loversLeapRock);
        m_map.addMarker(hogsbackRock);
        m_map.addMarker(maryannRock);

        m_map.addCircle(new CircleOptions()
                .center(castleLatLng)
                .radius(500)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(64,0,255,10))
                .strokeWidth(1)
        );

        flyTo(LAKETAHOE);
    }

    private void flyTo(CameraPosition target)
    {
        m_map.moveCamera(CameraUpdateFactory.newCameraPosition(target));
        m_map.setMapType((GoogleMap.MAP_TYPE_HYBRID));
        m_map.addPolyline(new PolylineOptions().geodesic(true)
                .add(spoonerLatLng)
                .add(loversLatLng)
                .add(castleLatLng)
                .add(spoonerCragRock.getPosition())
                .color(0xff00ff00)
                .width(1)
        );
    }
}
