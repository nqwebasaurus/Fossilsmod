package fossils.fossils.client.blockentity.model.ludodactylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LudodactylusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftleg1;
	private final ModelPart leftleg2;
	private final ModelPart leftfoot;
	private final ModelPart leftlegwing2;
	private final ModelPart leftlegwing1;
	private final ModelPart rightleg1;
	private final ModelPart rightleg2;
	private final ModelPart rightfoot;
	private final ModelPart rightlegwing2;
	private final ModelPart rightlegwing1;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart shoulder;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftWing;
	private final ModelPart leftwing6;
	private final ModelPart leftwing5membrance2;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4membrance;
	private final ModelPart leftwing3membrance;
	private final ModelPart leftwing1membrance;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightWing;
	private final ModelPart rightwing6;
	private final ModelPart rightwing5membrance2;
	private final ModelPart righthand2;
	private final ModelPart rightwing4membrance;
	private final ModelPart rightwing3membrance;
	private final ModelPart rightwing1membrance;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart bone2;
	private final ModelPart jaw;
	private final ModelPart tail;

	public LudodactylusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftleg1 = this.hips.getChild("leftleg1");
		this.leftleg2 = this.leftleg1.getChild("leftleg2");
		this.leftfoot = this.leftleg2.getChild("leftfoot");
		this.leftlegwing2 = this.leftleg2.getChild("leftlegwing2");
		this.leftlegwing1 = this.leftleg1.getChild("leftlegwing1");
		this.rightleg1 = this.hips.getChild("rightleg1");
		this.rightleg2 = this.rightleg1.getChild("rightleg2");
		this.rightfoot = this.rightleg2.getChild("rightfoot");
		this.rightlegwing2 = this.rightleg2.getChild("rightlegwing2");
		this.rightlegwing1 = this.rightleg1.getChild("rightlegwing1");
		this.bone = this.hips.getChild("bone");
		this.body = this.hips.getChild("body");
		this.shoulder = this.body.getChild("shoulder");
		this.leftwing1 = this.shoulder.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftWing = this.leftwing5.getChild("leftWing");
		this.leftwing6 = this.leftwing4.getChild("leftwing6");
		this.leftwing5membrance2 = this.leftwing6.getChild("leftwing5membrance2");
		this.lefthand2 = this.leftwing4.getChild("lefthand2");
		this.leftwing4membrance = this.leftwing4.getChild("leftwing4membrance");
		this.leftwing3membrance = this.leftwing2.getChild("leftwing3membrance");
		this.leftwing1membrance = this.leftwing1.getChild("leftwing1membrance");
		this.rightwing1 = this.shoulder.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightWing = this.rightwing5.getChild("rightWing");
		this.rightwing6 = this.rightwing4.getChild("rightwing6");
		this.rightwing5membrance2 = this.rightwing6.getChild("rightwing5membrance2");
		this.righthand2 = this.rightwing4.getChild("righthand2");
		this.rightwing4membrance = this.rightwing4.getChild("rightwing4membrance");
		this.rightwing3membrance = this.rightwing2.getChild("rightwing3membrance");
		this.rightwing1membrance = this.rightwing1.getChild("rightwing1membrance");
		this.neck4 = this.shoulder.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.bone2 = this.head.getChild("bone2");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.5943F, 10.5037F, -0.5236F, 0.0F, 0.0F));

		PartDefinition body12_r1 = hips.addOrReplaceChild("body12_r1", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-0.55F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.0533F, 1.7385F, -0.7373F, -2.3117F, -0.0118F, -0.5912F));

		PartDefinition body11_r1 = hips.addOrReplaceChild("body11_r1", CubeListBuilder.create().texOffs(69, 87).mirror().addBox(-0.546F, -0.5539F, -0.3188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(44, 87).mirror().addBox(-0.546F, -0.1789F, -0.3188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(0, 84).mirror().addBox(-0.546F, -0.8039F, -0.7188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5447F, 1.1519F, 0.2946F, 1.6644F, -0.1F, -0.6882F));

		PartDefinition body11_r2 = hips.addOrReplaceChild("body11_r2", CubeListBuilder.create().texOffs(27, 87).mirror().addBox(-0.596F, -0.1852F, -0.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(15, 87).mirror().addBox(-0.596F, -0.1852F, -0.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.5447F, 1.1519F, 0.2946F, -2.0008F, -0.1F, -0.6882F));

		PartDefinition body8_r1 = hips.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(87, 43).mirror().addBox(-0.5F, -0.425F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-1.1433F, -0.1192F, -0.0572F, -0.9399F, -0.1104F, -0.3594F));

		PartDefinition body8_r2 = hips.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(79, 24).mirror().addBox(-0.6344F, -0.5966F, -0.6093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.313F)).mirror(false)
				.texOffs(79, 20).mirror().addBox(-0.6344F, -0.2966F, -0.8094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.9573F, 0.0808F, 0.2266F, -1.3326F, -0.1104F, -0.3594F));

		PartDefinition body9_r1 = hips.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-0.9427F, -0.6003F, -1.6668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.315F)).mirror(false)
				.texOffs(79, 4).addBox(1.8573F, -0.6003F, -1.6668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.315F)), PartPose.offsetAndRotation(-0.9573F, 0.4808F, 1.3266F, -0.5236F, 0.0F, 0.0F));

		PartDefinition body8_r3 = hips.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(10, 87).mirror().addBox(-0.9427F, -0.3709F, -0.3391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(10, 87).addBox(1.8573F, -0.3709F, -0.3391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.9573F, 0.0808F, 1.3266F, -0.9599F, 0.0F, 0.0F));

		PartDefinition body7_r1 = hips.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.9427F, -1.272F, -0.0832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 18).mirror().addBox(-0.9427F, -1.272F, -0.4582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(5, 87).addBox(1.8573F, -1.272F, -0.0832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 18).addBox(1.8573F, -1.272F, -0.4582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.9573F, 0.0808F, 0.2266F, -0.9599F, 0.0F, 0.0F));

		PartDefinition body8_r4 = hips.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(76, 57).mirror().addBox(-0.1F, -0.6018F, 0.0248F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 57).addBox(0.9F, -0.6018F, 0.0248F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4F, -0.3437F, -0.6782F, -0.3229F, 0.0F, 0.0F));

		PartDefinition body7_r2 = hips.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-0.9427F, -0.8039F, -1.1388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 12).addBox(1.8573F, -0.8039F, -1.1388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9573F, 0.0808F, 0.2266F, -0.192F, 0.0F, 0.0F));

		PartDefinition body5_r1 = hips.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(75, 77).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2979F, -0.768F, -0.7706F, -0.7925F, -0.1738F, 0.082F));

		PartDefinition body8_r5 = hips.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(85, 60).mirror().addBox(-0.546F, 0.1033F, -0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5447F, 1.1519F, 0.2946F, 2.1007F, -0.1F, -0.6882F));

		PartDefinition body6_r1 = hips.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(79, 16).mirror().addBox(-0.6344F, -0.6966F, -0.6093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9573F, 0.0808F, 0.2266F, -1.2017F, -0.1104F, -0.3594F));

		PartDefinition body4_r1 = hips.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(75, 77).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2979F, -0.768F, -0.7706F, -0.7925F, 0.1738F, -0.082F));

		PartDefinition body11_r3 = hips.addOrReplaceChild("body11_r3", CubeListBuilder.create().texOffs(5, 79).addBox(-0.45F, -0.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0533F, 1.7385F, -0.7373F, -2.3117F, 0.0118F, 0.5912F));

		PartDefinition body10_r1 = hips.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(27, 87).addBox(-0.404F, -0.1852F, -0.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(15, 87).addBox(-0.404F, -0.1852F, -0.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.5447F, 1.1519F, 0.2946F, -2.0008F, 0.1F, 0.6882F));

		PartDefinition body8_r6 = hips.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(86, 15).addBox(-0.404F, -0.091F, -0.0991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.5447F, 1.1519F, 0.2946F, -1.6954F, 0.1F, 0.6882F));

		PartDefinition body10_r2 = hips.addOrReplaceChild("body10_r2", CubeListBuilder.create().texOffs(69, 87).addBox(-0.454F, -0.5539F, -0.3188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(44, 87).addBox(-0.454F, -0.1789F, -0.3188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(0, 84).addBox(-0.454F, -0.8039F, -0.7188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5447F, 1.1519F, 0.2946F, 1.6644F, 0.1F, 0.6882F));

		PartDefinition body7_r3 = hips.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(85, 60).addBox(-0.454F, 0.1033F, -0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5447F, 1.1519F, 0.2946F, 2.1007F, 0.1F, 0.6882F));

		PartDefinition body7_r4 = hips.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(79, 24).addBox(-0.3656F, -0.5966F, -0.6093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.313F))
				.texOffs(79, 20).addBox(-0.3656F, -0.2966F, -0.8094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.9573F, 0.0808F, 0.2266F, -1.3326F, 0.1104F, 0.3594F));

		PartDefinition body7_r5 = hips.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(87, 43).addBox(-0.5F, -0.425F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(1.1433F, -0.1192F, -0.0572F, -0.9399F, 0.1104F, 0.3594F));

		PartDefinition body5_r2 = hips.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(79, 16).addBox(-0.3656F, -0.6966F, -0.6093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9573F, 0.0808F, 0.2266F, -1.2017F, 0.1104F, 0.3594F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 44).addBox(-1.0F, -0.05F, -0.0013F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.0F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftleg1 = hips.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(10, 71).addBox(-0.3039F, 0.0711F, -0.3881F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.681F, -0.1866F, 0.2271F, 1.2495F, 0.1266F, -0.1562F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2194F, 6.3786F, 0.4956F, 0.7242F, -0.0836F, -0.028F));

		PartDefinition leg6_r1 = leftleg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(16, 67).addBox(-1.15F, -2.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(26, 67).addBox(-0.05F, -2.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(32, 64).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1229F, 7.4039F, 0.6576F, -0.0091F, 0.0F, 0.0F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = hips.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(0, 76).addBox(-0.6961F, 0.0711F, -0.3881F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.681F, -0.1866F, 0.2271F, 1.075F, -0.1266F, 0.1562F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2194F, 6.3786F, 0.4956F, 0.5467F, 0.0182F, -0.0298F));

		PartDefinition leg7_r1 = rightleg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(21, 67).addBox(0.15F, -2.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 69).addBox(-0.95F, -2.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0191F, 1.592F, -0.1464F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(43, 65).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1229F, 7.4039F, 0.6576F, -0.0091F, 0.0F, 0.0F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.092F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6039F, 0.0711F, 1.1119F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5557F, 0.8424F, 0.9592F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition chest7_r1 = body.addOrReplaceChild("chest7_r1", CubeListBuilder.create().texOffs(89, 88).mirror().addBox(-1.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2685F, -0.1571F, -0.0326F, -0.4133F, -1.4581F));

		PartDefinition chest6_r1 = body.addOrReplaceChild("chest6_r1", CubeListBuilder.create().texOffs(89, 55).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2685F, -0.1571F, -0.2715F, -0.3172F, -0.8104F));

		PartDefinition chest5_r1 = body.addOrReplaceChild("chest5_r1", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9685F, -2.1571F, -0.066F, -0.1614F, -0.7373F));

		PartDefinition chest6_r2 = body.addOrReplaceChild("chest6_r2", CubeListBuilder.create().texOffs(82, 41).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9685F, -2.1571F, 0.0394F, -0.1697F, -1.3568F));

		PartDefinition chest6_r3 = body.addOrReplaceChild("chest6_r3", CubeListBuilder.create().texOffs(89, 88).addBox(0.8192F, -0.5736F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2685F, -0.1571F, -0.0326F, 0.4133F, 1.4581F));

		PartDefinition chest5_r2 = body.addOrReplaceChild("chest5_r2", CubeListBuilder.create().texOffs(89, 55).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2685F, -0.1571F, -0.2715F, 0.3172F, 0.8104F));

		PartDefinition chest4_r1 = body.addOrReplaceChild("chest4_r1", CubeListBuilder.create().texOffs(62, 57).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9685F, -2.1571F, -0.066F, 0.1614F, 0.7373F));

		PartDefinition chest5_r3 = body.addOrReplaceChild("chest5_r3", CubeListBuilder.create().texOffs(82, 41).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9685F, -2.1571F, 0.0394F, 0.1697F, 1.3568F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 90).addBox(0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 10).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6F, -2.5F, -0.4014F, 0.0F, 0.0F));

		PartDefinition shoulder = body.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.6F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest4_r2 = shoulder.addOrReplaceChild("chest4_r2", CubeListBuilder.create().texOffs(73, 35).mirror().addBox(-1.7056F, -2.0454F, -0.9152F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.906F, 1.4285F, -2.8661F, 0.2255F, 0.4695F, 0.1034F));

		PartDefinition chest5_r4 = shoulder.addOrReplaceChild("chest5_r4", CubeListBuilder.create().texOffs(45, 75).mirror().addBox(-0.9762F, -1.086F, -0.8542F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.906F, 1.4285F, -2.8661F, 1.4734F, 0.4532F, -0.483F));

		PartDefinition chest6_r4 = shoulder.addOrReplaceChild("chest6_r4", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5685F, -1.5571F, 0.1158F, -0.0105F, -0.7006F));

		PartDefinition chest7_r2 = shoulder.addOrReplaceChild("chest7_r2", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-2.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5685F, -1.5571F, 0.101F, 0.0578F, -1.3079F));

		PartDefinition chest3_r1 = shoulder.addOrReplaceChild("chest3_r1", CubeListBuilder.create().texOffs(73, 35).addBox(0.7056F, -2.0454F, -0.9152F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.906F, 1.4285F, -2.8661F, 0.2255F, -0.4695F, -0.1034F));

		PartDefinition chest4_r3 = shoulder.addOrReplaceChild("chest4_r3", CubeListBuilder.create().texOffs(45, 75).addBox(-0.0238F, -1.086F, -0.8542F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.906F, 1.4285F, -2.8661F, 1.4734F, -0.4532F, 0.483F));

		PartDefinition chest3_r2 = shoulder.addOrReplaceChild("chest3_r2", CubeListBuilder.create().texOffs(82, 35).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8865F, -3.9751F, -0.7243F, 0.0F, 0.0F));

		PartDefinition chest2_r1 = shoulder.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(32, 59).addBox(-2.406F, 0.6924F, -1.0825F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.906F, 1.4285F, -2.2661F, -0.3403F, 0.0F, 0.0F));

		PartDefinition chest5_r5 = shoulder.addOrReplaceChild("chest5_r5", CubeListBuilder.create().texOffs(5, 90).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5685F, -1.5571F, 0.1158F, 0.0105F, 0.7006F));

		PartDefinition chest6_r5 = shoulder.addOrReplaceChild("chest6_r5", CubeListBuilder.create().texOffs(82, 77).addBox(0.8192F, -0.5736F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5685F, -1.5571F, 0.101F, -0.0578F, 1.3079F));

		PartDefinition cube_r3 = shoulder.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 90).addBox(0.5F, -0.7436F, -0.0682F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -1.7F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = shoulder.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(69, 72).addBox(0.0F, -0.0015F, -2.899F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5F, 0.1F, -0.4451F, 0.0F, 0.0F));

		PartDefinition leftwing1 = shoulder.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5043F, 1.6255F, -2.1403F, -0.0206F, -0.4F, 1.2304F));

		PartDefinition upperwing8_r1 = leftwing1.addOrReplaceChild("upperwing8_r1", CubeListBuilder.create().texOffs(62, 51).addBox(-0.55F, -0.7F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition upperwing7_r1 = leftwing1.addOrReplaceChild("upperwing7_r1", CubeListBuilder.create().texOffs(34, 84).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3246F, 0.0368F, 0.2605F, -1.0751F, -0.6358F, -0.3107F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(11, 60).addBox(-0.9789F, -0.0386F, -0.1429F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 65).addBox(-0.9789F, -0.0386F, -0.9429F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.5905F, -0.2692F, 0.1445F, -1.2354F, 0.0694F, -1.8187F));

		PartDefinition wing9_r1 = leftwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(5, 83).addBox(-0.3631F, -1.8211F, -0.7404F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.8717F, 9.764F, -0.1798F, 1.2479F, -0.9338F, -0.3491F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(61, 81).addBox(-0.3631F, -3.6202F, -1.6949F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.8717F, 9.764F, -0.1798F, 0.4974F, -0.9338F, -0.3491F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.0417F, 9.0057F, -0.2893F, 0.459F, 0.6197F, 0.4218F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5799F, -0.5164F, -0.654F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2861F, 7.0361F, 0.7075F, 1.3008F, 0.2643F, -0.1467F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1352F, 0.4058F, 15.2377F, 0.1517F, 0.279F, 0.2285F));

		PartDefinition leftWing = leftwing5.addOrReplaceChild("leftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4494F, 12.5771F, 0.1355F, 0.2595F, 0.035F));

		PartDefinition wingfinger9_r1 = leftWing.addOrReplaceChild("wingfinger9_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3F, 9.1F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4F, -9.4F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0799F, 0.4836F, 8.346F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6512F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(73, 40).addBox(-1.0495F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0813F, -0.1957F, -0.7237F, -1.005F, 0.8338F, 0.8258F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-12.2799F, 3.7836F, 3.946F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.5397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3496F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = shoulder.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5043F, 1.6255F, -2.1403F, 0.0675F, -0.0606F, -0.912F));

		PartDefinition upperwing9_r1 = rightwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(62, 54).addBox(-4.45F, -0.7F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0746F, 0.0368F, 0.2605F, -1.1781F, 0.0F, 0.0F));

		PartDefinition upperwing8_r2 = rightwing1.addOrReplaceChild("upperwing8_r2", CubeListBuilder.create().texOffs(39, 84).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3246F, 0.0368F, 0.2605F, -1.0751F, 0.6358F, 0.3107F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(54, 65).addBox(-0.0211F, -0.0386F, -0.1429F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 65).addBox(-0.0211F, -0.0386F, -0.9429F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.5905F, -0.2692F, 0.1445F, -1.1161F, -0.1276F, 1.9365F));

		PartDefinition wing10_r1 = rightwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(29, 83).addBox(-0.6369F, -1.8211F, -0.7404F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8717F, 9.764F, -0.1798F, 1.2479F, 0.9338F, 0.3491F));

		PartDefinition wing9_r2 = rightwing2.addOrReplaceChild("wing9_r2", CubeListBuilder.create().texOffs(66, 81).addBox(-0.6369F, -3.6202F, -1.6949F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.8717F, 9.764F, -0.1798F, 0.4974F, 0.9338F, 0.3491F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(5, 66).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.0417F, 9.0057F, -0.2893F, 0.6059F, -0.426F, -0.6999F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create().texOffs(35, 18).addBox(-0.4201F, -0.5164F, -0.654F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2861F, 7.0361F, 0.7075F, 0.8346F, -0.4157F, 0.3932F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(29, 36).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1352F, 0.4058F, 15.2377F, 0.0645F, -0.279F, -0.2285F));

		PartDefinition rightWing = rightwing5.addOrReplaceChild("rightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4494F, 12.5771F, 0.1355F, -0.2595F, -0.035F));

		PartDefinition wingfinger10_r1 = rightWing.addOrReplaceChild("wingfinger10_r1", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, 0.3F, 9.1F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4F, -9.4F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0799F, 0.4836F, 8.346F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6512F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(75, 49).addBox(-0.9505F, -0.3636F, -0.0678F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0813F, -0.1957F, -0.7237F, -1.005F, -0.8338F, -0.8258F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(12.2799F, 3.7836F, 3.946F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.5397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		PartDefinition neck4 = shoulder.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2375F, -2.7322F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 90).addBox(0.0F, -0.8964F, -1.1554F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 81).addBox(-0.5F, -0.1964F, -2.1554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.4F, -0.2356F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.257F, -1.7336F, 0.3505F, 0.1289F, 0.0229F));

		PartDefinition cube_r6 = neck3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 90).addBox(0.0F, -1.6F, -1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 44).addBox(-0.5F, -1.0F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.733F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -1.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 90).addBox(0.5F, -0.5461F, 2.944F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(10, 90).addBox(0.5F, -0.5461F, 0.944F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(70, 15).addBox(0.0F, 0.0539F, 0.944F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -3.3261F, -2.1737F, -0.8552F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1467F, -2.0229F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 79).addBox(0.5F, -1.9F, -3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 5).addBox(0.0F, -1.3F, -4.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1238F, 1.8425F, -0.2094F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.351F, -2.3416F, -0.2066F, 0.2387F, -0.3988F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(50, 82).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.8F, 1.2699F, -0.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 82).addBox(-0.5F, -1.9F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8F, 0.6905F, -0.5001F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 76).addBox(-1.0F, -1.5F, -0.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2632F, -0.8041F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-1.11F, 0.6418F, -0.6756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(78, 65).addBox(0.51F, 0.6418F, -0.6756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2F, -0.2285F, -1.6933F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(-1.11F, -0.6514F, -0.2044F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 73).addBox(0.51F, -0.6514F, -0.2044F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 0.7715F, -0.7933F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(86, 9).mirror().addBox(-0.5F, -0.7697F, -1.3278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 63).mirror().addBox(-0.5F, -0.7697F, -0.8278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(86, 9).addBox(0.92F, -0.7697F, -1.3278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 63).addBox(0.92F, -0.7697F, -0.8278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.71F, 0.4076F, -2.3124F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(85, 66).mirror().addBox(-0.5F, -0.9F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 66).addBox(0.92F, -0.9F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.71F, 0.2076F, -2.7124F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(79, 8).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(79, 8).addBox(0.92F, -0.5F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.71F, -0.4369F, -1.3254F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 85).mirror().addBox(-0.35F, -0.2104F, -0.2298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(22, 85).addBox(1.07F, -0.2104F, -0.2298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.86F, -1.1566F, -1.2465F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-0.35F, -0.243F, -1.3994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(78, 61).addBox(1.07F, -0.243F, -1.3994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.86F, 0.0434F, -1.7465F, -2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(22, 77).mirror().addBox(-0.35F, -0.3187F, -1.4354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 77).addBox(1.07F, -0.3187F, -1.4354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.86F, 0.0434F, -1.7465F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-0.35F, -0.1883F, -0.2137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(20, 88).addBox(1.07F, -0.1883F, -0.2137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.86F, -1.1066F, -2.3715F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(84, 54).mirror().addBox(-1.0F, -0.9157F, 0.2288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(84, 54).addBox(-0.4F, -0.9157F, 0.2288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, 1.6F, -2.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-1.5F, -1.8556F, -3.061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 82).addBox(-0.5F, -1.8556F, -3.061F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 25).addBox(-1.5F, -1.6454F, -2.175F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.7F, 0.3F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.025F, -0.4404F, -8.6451F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3F, -2.0F, 0.4276F, -0.0611F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(79, 87).mirror().addBox(0.2193F, 1.2901F, -5.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.4F, -7.0F, 0.4827F, -0.1469F, 0.4309F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(0.2092F, 1.6437F, -6.2335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.4F, -7.0F, 0.3954F, -0.1469F, 0.4309F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(0.5218F, 1.5482F, -7.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.4F, -7.0F, 0.366F, -0.2119F, 0.5956F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(89, 75).mirror().addBox(0.616F, 2.2715F, -7.9668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(54, 89).mirror().addBox(0.616F, 1.9715F, -7.9668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 89).mirror().addBox(0.516F, 2.3715F, -9.2668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(89, 49).mirror().addBox(0.516F, 1.8715F, -9.2668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.4F, -7.0F, 0.2557F, -0.2482F, 0.6965F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(89, 52).mirror().addBox(-2.4427F, 6.0734F, -8.1687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.4F, -7.2F, -0.1793F, -0.6178F, 0.7431F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(85, 57).mirror().addBox(-2.4427F, 6.9883F, -6.6908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.4F, -7.2F, -0.3887F, -0.6178F, 0.7431F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(32, 51).mirror().addBox(-0.9F, 1.5672F, -9.9459F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(32, 51).addBox(-0.5F, 1.5672F, -9.9459F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 1.4F, -7.0F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(17, 59).mirror().addBox(-0.1F, -0.4722F, -9.2236F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3F, -2.0F, 0.3927F, -0.0611F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(68, 77).mirror().addBox(-0.1F, -0.4584F, -1.6366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3F, -2.0F, 0.3578F, -0.0611F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(70, 20).mirror().addBox(-0.1F, -0.5392F, -4.1548F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3F, -2.0F, 0.4102F, -0.0611F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(86, 85).mirror().addBox(-0.509F, -1.0736F, -1.2554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3975F, 0.5693F, -4.3229F, 2.142F, -0.0193F, 0.251F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.509F, -0.4909F, -1.218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3975F, 0.5693F, -4.3229F, 1.4002F, -0.0193F, 0.251F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(70, 30).mirror().addBox(-0.2F, -0.1682F, -2.7475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.8F, -3.3F, 0.5978F, -0.0873F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(-0.5F, -0.175F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.096F, 2.7127F, -8.1231F, 0.9848F, -0.0575F, 0.0183F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(17, 51).mirror().addBox(-0.6917F, -0.2809F, -5.7047F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0292F, 0.7516F, -5.3256F, 0.5485F, -0.0575F, 0.0183F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(12, 82).mirror().addBox(-0.5F, -2.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.1157F, 2.8505F, -7.8252F, 1.9884F, -0.0575F, 0.0183F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(68, 77).addBox(-0.9F, -0.4584F, -1.6366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, 1.3F, -2.0F, 0.3578F, 0.0611F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(70, 20).addBox(-0.9F, -0.5392F, -4.1548F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, 1.3F, -2.0F, 0.4102F, 0.0611F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(58, 44).addBox(-0.3F, 1.1279F, -7.4117F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2F, 1.4F, -7.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(45, 59).addBox(-0.3F, -0.2004F, -3.0907F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 3.0F, -9.2F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(36, 75).addBox(-0.3F, -0.2862F, -0.2403F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 5.1F, -13.3F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(70, 0).addBox(-0.3F, -0.3019F, -10.1402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2F, 1.4F, -7.0F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(89, 52).addBox(1.4427F, 6.0734F, -8.1687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2F, 1.4F, -7.2F, -0.1793F, 0.6178F, -0.7431F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(85, 57).addBox(1.4427F, 6.9883F, -6.6908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.4F, -7.2F, -0.3887F, 0.6178F, -0.7431F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(89, 49).addBox(-1.516F, 1.8715F, -9.2668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 89).addBox(-1.516F, 2.3715F, -9.2668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(89, 75).addBox(-1.616F, 2.2715F, -7.9668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(54, 89).addBox(-1.616F, 1.9715F, -7.9668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.4F, -7.0F, 0.2557F, 0.2482F, -0.6965F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(89, 46).addBox(-1.5218F, 1.5482F, -7.1335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.4F, -7.0F, 0.366F, 0.2119F, -0.5956F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(84, 48).addBox(-1.2092F, 1.6437F, -6.2335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.4F, -7.0F, 0.3954F, 0.1469F, -0.4309F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(79, 87).addBox(-1.2193F, 1.2901F, -5.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 1.4F, -7.0F, 0.4827F, 0.1469F, -0.4309F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 51).addBox(-1.025F, -0.4404F, -8.6451F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, 1.3F, -2.0F, 0.4276F, 0.0611F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(17, 59).addBox(-0.9F, -0.4722F, -9.2236F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.1F, 1.3F, -2.0F, 0.3927F, 0.0611F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(36, 70).addBox(-0.2F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.3275F, 0.1763F, -4.1151F, 0.5978F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(12, 82).addBox(-0.5F, -2.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.1157F, 2.8505F, -7.8252F, 1.9884F, 0.0575F, -0.0183F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(84, 51).addBox(-0.5F, -0.175F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.096F, 2.7127F, -8.1231F, 0.9848F, 0.0575F, -0.0183F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(17, 51).addBox(-0.3083F, -0.2809F, -5.7047F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0292F, 0.7516F, -5.3256F, 0.5485F, 0.0575F, -0.0183F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(86, 12).addBox(-0.5F, -0.3F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3996F, -0.3865F, -3.2916F, -0.1004F, 0.0873F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(86, 85).addBox(-0.491F, -1.0736F, -1.2554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3975F, 0.5693F, -4.3229F, 2.142F, 0.0193F, -0.251F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(79, 0).addBox(-0.491F, -0.4909F, -1.218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3975F, 0.5693F, -4.3229F, 1.4002F, 0.0193F, -0.251F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(70, 30).addBox(-0.8F, -0.1682F, -2.7475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, -0.8F, -3.3F, 0.5978F, 0.0873F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 53).addBox(-0.5F, -0.0465F, -1.9748F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7611F, -3.2584F, 2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(54, 76).addBox(0.5F, -0.204F, -1.8006F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.0F, -1.7611F, -2.2084F, 2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 86).addBox(0.5F, -0.1929F, -0.7907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -4.9611F, 0.4916F, 2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(86, 82).addBox(0.5F, -0.2185F, -1.3817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(64, 86).addBox(0.5F, -0.2185F, -0.7817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.0F, -4.3111F, 1.9166F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 86).addBox(0.5F, -0.2106F, -0.8025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -4.9111F, 2.0167F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(54, 86).addBox(0.5F, -0.2003F, -0.8025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-1.0F, -5.2611F, 1.5167F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(86, 30).addBox(0.5F, -0.2119F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.0F, -5.3861F, 0.9417F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(15, 77).addBox(0.5F, -0.2004F, -1.7895F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.0F, -3.7861F, -0.5833F, 2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(86, 27).addBox(0.5F, -0.1937F, -0.7952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -1.2611F, -2.5583F, 2.522F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(86, 24).addBox(-0.5F, -0.55F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.3635F, -0.2802F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(78, 81).addBox(0.0F, -0.999F, -1.0338F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -1.6611F, -1.8583F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(71, 81).addBox(0.0F, -1.0172F, -0.9771F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -1.8611F, -0.8583F, 1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(79, 32).addBox(0.0F, -0.0172F, -0.9771F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, -1.8611F, -0.8583F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(82, 38).addBox(0.0F, -0.0538F, -1.0265F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.3611F, 0.0417F, 0.6632F, 0.0F, 0.0F));

		PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.66F, 0.0434F, -1.7465F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(74, 87).mirror().addBox(-0.47F, -0.4937F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(86, 21).mirror().addBox(-0.65F, -0.4937F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(86, 21).addBox(0.97F, -0.4937F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(74, 87).addBox(0.79F, -0.4937F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.32F, 0.0F, 0.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4392F, -0.4565F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r77 = jaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(29, 79).mirror().addBox(-0.198F, -0.7879F, -0.1557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 79).addBox(-0.198F, -0.7879F, -0.1557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.302F, 3.4497F, -11.0211F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r78 = jaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(43, 80).mirror().addBox(-0.198F, -0.8044F, -1.8543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(43, 80).addBox(-0.198F, -0.8044F, -1.8543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.302F, 3.4497F, -10.9211F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r79 = jaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(36, 80).mirror().addBox(-0.198F, -0.7678F, -0.1874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(36, 80).addBox(-0.198F, -0.7678F, -0.1874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.302F, 3.8497F, -13.3211F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r80 = jaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.198F, -0.8246F, -0.2508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(0, 88).addBox(-0.198F, -0.8246F, -0.2508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.302F, 3.9497F, -13.8211F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r81 = jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(78, 69).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 69).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.5231F, -14.7905F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r82 = jaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(89, 33).mirror().addBox(-0.198F, 0.2801F, -1.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(84, 88).mirror().addBox(-0.198F, 0.2801F, -1.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(89, 33).addBox(-0.198F, 0.2801F, -1.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(84, 88).addBox(-0.198F, 0.2801F, -1.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r83 = jaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(44, 84).mirror().addBox(-0.398F, 0.4555F, -1.7345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 84).addBox(0.002F, 0.4555F, -1.7345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r84 = jaw.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 84).mirror().addBox(-0.398F, -0.076F, -2.4793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(81, 84).addBox(0.002F, -0.076F, -2.4793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r85 = jaw.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(37, 88).mirror().addBox(-0.398F, 0.4183F, -1.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(37, 88).addBox(0.002F, 0.4183F, -1.1907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r86 = jaw.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(76, 84).mirror().addBox(-0.398F, -0.0134F, -1.241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 89).mirror().addBox(-0.398F, -0.0134F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(76, 84).addBox(0.002F, -0.0134F, -1.241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 89).addBox(0.002F, -0.0134F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(56, 59).mirror().addBox(-0.398F, 0.19F, -0.1679F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(56, 59).addBox(0.002F, 0.19F, -0.1679F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-0.3876F, -1.6325F, -2.3656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 3).mirror().addBox(-0.3876F, -1.9325F, -2.3656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.6979F, 0.0847F, -0.4107F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5044F, -0.7095F, -2.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 79).mirror().addBox(-0.5044F, -1.0095F, -2.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.1927F, 0.1469F, -0.7029F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(32, 88).mirror().addBox(-0.4945F, -0.631F, -1.245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 72).mirror().addBox(-0.4945F, -0.831F, -1.245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.3232F, 0.1127F, -0.4938F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.4852F, -0.6298F, -0.1679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(71, 84).mirror().addBox(-0.4852F, -0.4298F, -0.1679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.1855F, 0.0978F, -0.4796F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(64, 89).mirror().addBox(-0.4854F, -0.6259F, 0.9321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.1872F, 0.0945F, -0.4624F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(85, 69).mirror().addBox(-0.479F, -0.6114F, 2.0321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.302F, 2.6497F, -13.4211F, 0.1918F, 0.0847F, -0.4107F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.398F, -0.2278F, -3.5976F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 60).addBox(0.002F, -0.2278F, -3.5976F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.302F, 2.1497F, -10.0211F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)).mirror(false)
				.texOffs(67, 57).addBox(0.3F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.4F, 1.9407F, -8.977F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(-0.9F, 0.1551F, -5.8993F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.08F)).mirror(false)
				.texOffs(47, 51).mirror().addBox(-0.9F, -0.0949F, -5.8993F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(58, 36).addBox(-0.1F, 0.1551F, -5.8993F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.08F))
				.texOffs(47, 51).addBox(-0.1F, -0.0949F, -5.8993F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 0.6376F, -4.341F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(89, 39).mirror().addBox(-1.1F, -0.0802F, -0.4844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(89, 39).addBox(0.1F, -0.0802F, -0.4844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.0F, -0.1624F, -1.041F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(89, 36).mirror().addBox(-1.1F, -0.143F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(89, 36).addBox(0.1F, -0.143F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -0.1624F, -1.841F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(69, 67).mirror().addBox(-0.9F, -0.4283F, -2.7942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(69, 67).addBox(-0.1F, -0.4283F, -2.7942F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1376F, -1.841F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(69, 62).mirror().addBox(-0.9F, -0.9393F, -0.1123F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(69, 62).addBox(-0.1F, -0.9393F, -0.1123F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 1.7376F, -4.141F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(79, 28).mirror().addBox(-1.1F, -0.1F, -2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(79, 28).addBox(0.1F, -0.1F, -2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.0624F, 0.759F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(86, 6).addBox(-0.6124F, -1.6325F, -2.3656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(86, 3).addBox(-0.6124F, -1.9325F, -2.3656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.302F, 2.6497F, -13.4211F, 0.6979F, -0.0847F, 0.4107F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(86, 0).addBox(-0.4956F, -0.7095F, -2.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 79).addBox(-0.4956F, -1.0095F, -2.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.302F, 2.6497F, -13.4211F, 0.1927F, -0.1469F, 0.7029F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(32, 88).addBox(-0.5055F, -0.631F, -1.245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 72).addBox(-0.5055F, -0.831F, -1.245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.302F, 2.6497F, -13.4211F, 0.3232F, -0.1127F, 0.4938F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 76).addBox(-0.5148F, -0.6298F, -0.1679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(71, 84).addBox(-0.5148F, -0.4298F, -0.1679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.302F, 2.6497F, -13.4211F, 0.1855F, -0.0978F, 0.4796F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(64, 89).addBox(-0.5146F, -0.6259F, 0.9321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.302F, 2.6497F, -13.4211F, 0.1872F, -0.0945F, 0.4624F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(85, 69).addBox(-0.521F, -0.6114F, 2.0321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.302F, 2.6497F, -13.4211F, 0.1918F, -0.0847F, 0.4107F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(45, 70).addBox(-0.5F, -0.5377F, -0.0687F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6235F, 1.7081F, -0.2967F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}