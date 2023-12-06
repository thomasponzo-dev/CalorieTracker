package com.thomasponzo.tracker_domain.use_case

import com.thomasponzo.tracker_domain.model.TrackedFood
import com.thomasponzo.tracker_domain.repository.TrackerRepository

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deleteTrackedFood(trackedFood)
    }
}