package com.github.khangnt.mcp.ui.jobmaker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.khangnt.mcp.R
import com.github.khangnt.mcp.util.getViewModel
import kotlinx.android.synthetic.main.fragment_todo.*

/**
 * Created by Khang NT on 4/11/18.
 * Email: khang.neon.1997@gmail.com
 */

class ChooseOutputFragment : StepFragment() {

    /** Get shared view model via host activity **/
    private val jobMakerViewModel by lazy { requireActivity().getViewModel<JobMakerViewModel>() }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_choose_output, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        textView.text = """- Pick output folder
//- Show list output file
//- Highlight conflict output file with resolve options (rename, override)
//"""
    }

    override fun onGoToNextStep() {
        // jobMakerViewModel.getCommandConfig().makeJobs(final outputs)
        jobMakerViewModel.setCurrentStep(JobMakerViewModel.STEP_ADVERTISEMENT)
    }

}