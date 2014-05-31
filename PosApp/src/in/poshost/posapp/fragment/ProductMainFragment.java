package in.poshost.posapp.fragment;

import in.poshost.posapp.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProductMainFragment extends Fragment {

		public ProductMainFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_product_main, container,
					false);
			
//			Button button = (Button) findViewById(R.id.);
			return rootView;
		}
	}