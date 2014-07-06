
package in.poshost.posapp.fragment.product;

import in.poshost.posapp.R;
import in.poshost.posapp.model.Transaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class EditProductFragment extends Fragment {

    private final static String tag = "in.poshost.posapp.fragment.payment.PaymentTypeFragment";
    private ImageView ivProductImage;
    private TextView tvProductName;
    private TextView tvProductPriceOriginal;
    private EditText etUpdatedPrice;
    private EditText etQuantity;
    private EditText etProductTotal;
    private CheckBox cbTaxable;

    public EditProductFragment() {
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_edit_product,
                container, false);
        
        Bundle extras = getActivity().getIntent().getExtras(); 
        Transaction transaction = (Transaction) extras.getSerializable("TRANSACTION"); 
        
        setupViews(rootView);
        
        initializeViews(transaction);
        
        return rootView;
    }
    
    private void initializeViews(Transaction t) {
        tvProductName.setText(t.getName());
        tvProductPriceOriginal.setText(String.valueOf(t.getPrice()));
    }

    private void setupViews(View rootView){
        ivProductImage = (ImageView) rootView.findViewById(R.id.ivProductImage);
        tvProductName = (TextView) rootView.findViewById(R.id.tvProductName);
        tvProductPriceOriginal = (TextView) rootView.findViewById(R.id.tvProductPriceOriginal);
        etUpdatedPrice = (EditText) rootView.findViewById(R.id.etUpdatedPrice);
        etQuantity = (EditText) rootView.findViewById(R.id.etQuantity);
        etProductTotal = (EditText) rootView.findViewById(R.id.etProductTotal);
        cbTaxable = (CheckBox) rootView.findViewById(R.id.cbTaxable);
    }
}
