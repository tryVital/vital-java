package com.vital.api;

import com.vital.api.core.ClientOptions;
import com.vital.api.core.Suppliers;
import com.vital.api.resources.athomephlebotomy.AthomePhlebotomyClient;
import com.vital.api.resources.body.BodyClient;
import com.vital.api.resources.devices.DevicesClient;
import com.vital.api.resources.labtests.LabTestsClient;
import com.vital.api.resources.labtests.LabtestsClient;
import com.vital.api.resources.link.LinkClient;
import com.vital.api.resources.meals.MealsClient;
import com.vital.api.resources.order.OrderClient;
import com.vital.api.resources.orders.OrdersClient;
import com.vital.api.resources.physician.PhysicianClient;
import com.vital.api.resources.profile.ProfileClient;
import com.vital.api.resources.providers.ProvidersClient;
import com.vital.api.resources.sleep.SleepClient;
import com.vital.api.resources.summary.SummaryClient;
import com.vital.api.resources.team.TeamClient;
import com.vital.api.resources.timeseries.TimeseriesClient;
import com.vital.api.resources.user.UserClient;
import com.vital.api.resources.users.UsersClient;
import com.vital.api.resources.vitals.VitalsClient;
import com.vital.api.resources.webhook.WebhookClient;
import com.vital.api.resources.workouts.WorkoutsClient;
import java.util.function.Supplier;

public class VitalApiClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<WebhookClient> webhookClient;

    protected final Supplier<LinkClient> linkClient;

    protected final Supplier<ProfileClient> profileClient;

    protected final Supplier<SummaryClient> summaryClient;

    protected final Supplier<DevicesClient> devicesClient;

    protected final Supplier<WorkoutsClient> workoutsClient;

    protected final Supplier<SleepClient> sleepClient;

    protected final Supplier<BodyClient> bodyClient;

    protected final Supplier<MealsClient> mealsClient;

    protected final Supplier<VitalsClient> vitalsClient;

    protected final Supplier<TimeseriesClient> timeseriesClient;

    protected final Supplier<UsersClient> usersClient;

    protected final Supplier<UserClient> userClient;

    protected final Supplier<TeamClient> teamClient;

    protected final Supplier<ProvidersClient> providersClient;

    protected final Supplier<PhysicianClient> physicianClient;

    protected final Supplier<LabtestsClient> labtestsClient;

    protected final Supplier<LabTestsClient> labTestsClient;

    protected final Supplier<OrderClient> orderClient;

    protected final Supplier<AthomePhlebotomyClient> athomePhlebotomyClient;

    protected final Supplier<OrdersClient> ordersClient;

    public VitalApiClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.webhookClient = Suppliers.memoize(() -> new WebhookClient(clientOptions));
        this.linkClient = Suppliers.memoize(() -> new LinkClient(clientOptions));
        this.profileClient = Suppliers.memoize(() -> new ProfileClient(clientOptions));
        this.summaryClient = Suppliers.memoize(() -> new SummaryClient(clientOptions));
        this.devicesClient = Suppliers.memoize(() -> new DevicesClient(clientOptions));
        this.workoutsClient = Suppliers.memoize(() -> new WorkoutsClient(clientOptions));
        this.sleepClient = Suppliers.memoize(() -> new SleepClient(clientOptions));
        this.bodyClient = Suppliers.memoize(() -> new BodyClient(clientOptions));
        this.mealsClient = Suppliers.memoize(() -> new MealsClient(clientOptions));
        this.vitalsClient = Suppliers.memoize(() -> new VitalsClient(clientOptions));
        this.timeseriesClient = Suppliers.memoize(() -> new TimeseriesClient(clientOptions));
        this.usersClient = Suppliers.memoize(() -> new UsersClient(clientOptions));
        this.userClient = Suppliers.memoize(() -> new UserClient(clientOptions));
        this.teamClient = Suppliers.memoize(() -> new TeamClient(clientOptions));
        this.providersClient = Suppliers.memoize(() -> new ProvidersClient(clientOptions));
        this.physicianClient = Suppliers.memoize(() -> new PhysicianClient(clientOptions));
        this.labtestsClient = Suppliers.memoize(() -> new LabtestsClient(clientOptions));
        this.labTestsClient = Suppliers.memoize(() -> new LabTestsClient(clientOptions));
        this.orderClient = Suppliers.memoize(() -> new OrderClient(clientOptions));
        this.athomePhlebotomyClient = Suppliers.memoize(() -> new AthomePhlebotomyClient(clientOptions));
        this.ordersClient = Suppliers.memoize(() -> new OrdersClient(clientOptions));
    }

    public WebhookClient webhook() {
        return this.webhookClient.get();
    }

    public LinkClient link() {
        return this.linkClient.get();
    }

    public ProfileClient profile() {
        return this.profileClient.get();
    }

    public SummaryClient summary() {
        return this.summaryClient.get();
    }

    public DevicesClient devices() {
        return this.devicesClient.get();
    }

    public WorkoutsClient workouts() {
        return this.workoutsClient.get();
    }

    public SleepClient sleep() {
        return this.sleepClient.get();
    }

    public BodyClient body() {
        return this.bodyClient.get();
    }

    public MealsClient meals() {
        return this.mealsClient.get();
    }

    public VitalsClient vitals() {
        return this.vitalsClient.get();
    }

    public TimeseriesClient timeseries() {
        return this.timeseriesClient.get();
    }

    public UsersClient users() {
        return this.usersClient.get();
    }

    public UserClient user() {
        return this.userClient.get();
    }

    public TeamClient team() {
        return this.teamClient.get();
    }

    public ProvidersClient providers() {
        return this.providersClient.get();
    }

    public PhysicianClient physician() {
        return this.physicianClient.get();
    }

    public LabtestsClient labtests() {
        return this.labtestsClient.get();
    }

    public LabTestsClient labTests() {
        return this.labTestsClient.get();
    }

    public OrderClient order() {
        return this.orderClient.get();
    }

    public AthomePhlebotomyClient athomePhlebotomy() {
        return this.athomePhlebotomyClient.get();
    }

    public OrdersClient orders() {
        return this.ordersClient.get();
    }

    public static VitalApiClientBuilder builder() {
        return new VitalApiClientBuilder();
    }
}
