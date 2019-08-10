package senac.macariocalcados.mapaloja;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import senac.macariocalcados.R;

public class mapaloja extends FragmentActivity implements OnMapReadyCallback {

        private GoogleMap mMap;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.acticity_maps);
            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map_view);
            mapFragment.getMapAsync(this);
        }


        @Override
        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;


            LatLng belem = new LatLng(-1.3650921, -48.3741034);

            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(-1.3650921, -48.3741034)).title("Macario Calçados")
                    .icon(bitmapDescriptorFromVector(this, R.drawable.ic_dashboard_black_24dp)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(belem, 14.5f));
        }


        private BitmapDescriptor bitmapDescriptorFromVector(Context context, @DrawableRes int vectorDrawableResourceId) {
            Drawable background = ContextCompat.getDrawable(context, vectorDrawableResourceId);
            background.setBounds(0, 0, background.getIntrinsicWidth(), background.getIntrinsicHeight());
            Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorDrawableResourceId);
            vectorDrawable.setBounds(40, 20, vectorDrawable.getIntrinsicWidth() + 40, vectorDrawable.getIntrinsicHeight() + 20);
            Bitmap bitmap = Bitmap.createBitmap(background.getIntrinsicWidth(), background.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            background.draw(canvas);
            vectorDrawable.draw(canvas);
            return BitmapDescriptorFactory.fromBitmap(bitmap);
        }
    }
