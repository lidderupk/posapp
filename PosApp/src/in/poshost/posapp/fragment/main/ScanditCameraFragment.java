package in.poshost.posapp.fragment.main;

import in.poshost.posapp.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mirasense.scanditsdk.ScanditSDKAutoAdjustingBarcodePicker;
import com.mirasense.scanditsdk.interfaces.ScanditSDK;
import com.mirasense.scanditsdk.interfaces.ScanditSDKListener;

public class ScanditCameraFragment extends Fragment implements ScanditSDKListener {

	private ScanditSDKAutoAdjustingBarcodePicker picker;

	public ScanditCameraFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main_scandit, container,
				false);

		picker = new ScanditSDKAutoAdjustingBarcodePicker(this.getActivity(),
				"BiLb7ubNEeOSb3Q9WWi5VaqcrcKzgfaRC6hdPo06dew", ScanditSDK.CAMERA_FACING_BACK);
		// Specify the object that will receive the callback events
		picker.getOverlayView().addListener(this);
		
		this.getActivity().setContentView(picker);

		return rootView;
	}

	@Override
	public void didCancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void didManualSearch(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void didScanBarcode(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onResume() {
		picker.startScanning();
		super.onResume();
	}

	@Override
	public void onPause() {
		picker.stopScanning();
		super.onPause();
	}
}