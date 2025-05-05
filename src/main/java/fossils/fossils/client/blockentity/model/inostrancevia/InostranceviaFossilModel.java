package fossils.fossils.client.blockentity.model.inostrancevia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class InostranceviaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart bodyfront;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart lowerjaw1;
	private final ModelPart lowerjaw2;
	private final ModelPart lowerjaw3;
	private final ModelPart lowerjawslope;
	private final ModelPart lowerjawteeth1;
	private final ModelPart jawparting;
	private final ModelPart upperjaw1;
	private final ModelPart upperjaw2;
	private final ModelPart nose;
	private final ModelPart upperjawteeth;
	private final ModelPart upperjawteeth1;
	private final ModelPart leftsabre;
	private final ModelPart rightsabre;
	private final ModelPart fur1;
	private final ModelPart fur2;
	private final ModelPart fur3;

	public InostranceviaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm6 = this.leftLeg3.getChild("leftArm6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm6 = this.rightLeg3.getChild("rightArm6");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.bodyfront = this.body2.getChild("bodyfront");
		this.chest = this.bodyfront.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.lowerjaw1 = this.head.getChild("lowerjaw1");
		this.lowerjaw2 = this.lowerjaw1.getChild("lowerjaw2");
		this.lowerjaw3 = this.lowerjaw2.getChild("lowerjaw3");
		this.lowerjawslope = this.lowerjaw2.getChild("lowerjawslope");
		this.lowerjawteeth1 = this.lowerjaw2.getChild("lowerjawteeth1");
		this.jawparting = this.lowerjaw1.getChild("jawparting");
		this.upperjaw1 = this.head.getChild("upperjaw1");
		this.upperjaw2 = this.upperjaw1.getChild("upperjaw2");
		this.nose = this.upperjaw2.getChild("nose");
		this.upperjawteeth = this.upperjaw2.getChild("upperjawteeth");
		this.upperjawteeth1 = this.upperjaw1.getChild("upperjawteeth1");
		this.leftsabre = this.upperjaw1.getChild("leftsabre");
		this.rightsabre = this.upperjaw1.getChild("rightsabre");
		this.fur1 = this.body.getChild("fur1");
		this.fur2 = this.fur1.getChild("fur2");
		this.fur3 = this.fur2.getChild("fur3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.375F, 8.0F, -0.4213F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(66, 90).addBox(0.0F, -2.8285F, -0.0158F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5249F, 4.7872F, -0.2007F, 0.0F, 0.0F));

		PartDefinition hips_r2 = hips.addOrReplaceChild("hips_r2", CubeListBuilder.create().texOffs(63, 90).addBox(0.0F, -3.0211F, -0.0058F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3249F, 2.7872F, -0.1484F, 0.0F, 0.0F));

		PartDefinition hips_r3 = hips.addOrReplaceChild("hips_r3", CubeListBuilder.create().texOffs(48, 90).addBox(0.0F, -3.0137F, 0.0041F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1249F, 0.7872F, -0.1309F, 0.0F, 0.0F));

		PartDefinition hips_r4 = hips.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.5F, 0.4F, 0.9F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 35).addBox(0.5F, 0.4F, 0.9F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1249F, -0.1128F, -0.096F, 0.0F, 0.0F));

		PartDefinition hips_r5 = hips.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(26, 39).mirror().addBox(-0.6782F, -0.1741F, -2.2632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, -0.3491F, 0.0F, -0.3491F));

		PartDefinition hips_r6 = hips.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(87, 24).mirror().addBox(-0.6782F, 0.5164F, -2.352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, -0.2182F, 0.0F, -0.3491F));

		PartDefinition hips_r7 = hips.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.6782F, 2.3042F, -2.2338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(65, 21).mirror().addBox(-0.6782F, 2.3042F, -2.6338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, -0.2618F, 0.0F, -0.3491F));

		PartDefinition hips_r8 = hips.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(87, 21).mirror().addBox(-0.6782F, 2.2006F, -1.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, -0.6981F, 0.0F, -0.3491F));

		PartDefinition hips_r9 = hips.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(61, 95).mirror().addBox(-0.6782F, 1.0466F, -2.1225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, -0.1745F, 0.0F, -0.3491F));

		PartDefinition hips_r10 = hips.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(53, 85).mirror().addBox(-0.6782F, 0.253F, -1.3969F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, -0.0873F, 0.0F, -0.3491F));

		PartDefinition hips_r11 = hips.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-0.6782F, -0.354F, -2.0864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(87, 8).mirror().addBox(-0.6782F, 2.5155F, 1.5329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, 0.2618F, 0.0F, -0.3491F));

		PartDefinition hips_r12 = hips.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.6782F, 0.2495F, -0.1249F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, -0.6109F, 0.0F, -0.3491F));

		PartDefinition hips_r13 = hips.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(97, 64).mirror().addBox(-0.6782F, 1.9215F, -0.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, 0.0873F, 0.0F, -0.3491F));

		PartDefinition hips_r14 = hips.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(73, 42).mirror().addBox(-0.6782F, 1.7057F, 0.7483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, -0.1222F, 0.0F, -0.3491F));

		PartDefinition hips_r15 = hips.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(97, 70).mirror().addBox(-0.6782F, 3.2016F, 1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, 0.6458F, 0.0F, -0.3491F));

		PartDefinition hips_r16 = hips.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(97, 51).mirror().addBox(-0.6782F, 3.1048F, -0.3197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, 0.9948F, 0.0F, -0.3491F));

		PartDefinition hips_r17 = hips.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(43, 62).mirror().addBox(-0.6782F, 0.2864F, -0.6695F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, 0.7767F, 0.0F, -0.3491F));

		PartDefinition hips_r18 = hips.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(54, 30).mirror().addBox(-0.846F, -0.662F, -1.5605F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, 0.4276F, 0.0F, -0.1309F));

		PartDefinition hips_r19 = hips.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.846F, -2.776F, 0.0533F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, -0.096F, 0.0F, -0.1309F));

		PartDefinition hips_r20 = hips.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(45, 25).mirror().addBox(-0.817F, -2.8407F, -2.0738F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, 0.1658F, 0.0F, -0.1309F));

		PartDefinition hips_r21 = hips.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(34, 64).mirror().addBox(-0.846F, -4.3267F, -0.894F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.129F, 3.4336F, 4.9446F, 0.7767F, 0.0F, -0.1309F));

		PartDefinition hips_r22 = hips.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(63, 57).mirror().addBox(-0.5F, -0.0596F, -1.986F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(63, 57).addBox(3.5F, -0.0596F, -1.986F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, -1.2009F, 2.9605F, 0.1222F, 0.0F, 0.0F));

		PartDefinition hips_r23 = hips.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(92, 85).mirror().addBox(-0.5F, -0.275F, -1.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(92, 77).mirror().addBox(-0.5F, -0.275F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(92, 85).addBox(3.5F, -0.275F, -1.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(92, 77).addBox(3.5F, -0.275F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, 0.3331F, 7.1446F, 0.2967F, 0.0F, 0.0F));

		PartDefinition hips_r24 = hips.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(92, 70).addBox(3.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0F, 0.3331F, 7.1446F, -0.1833F, 0.0F, 0.0F));

		PartDefinition hips_r25 = hips.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-0.5F, -0.1029F, -0.0451F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(82, 72).addBox(3.5F, -0.1029F, -0.0451F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, -0.6009F, 5.9605F, -0.4014F, 0.0F, 0.0F));

		PartDefinition hips_r26 = hips.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(49, 9).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(49, 9).addBox(3.5F, -0.5F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0F, -0.4009F, 4.8605F, -0.1833F, 0.0F, 0.0F));

		PartDefinition hips_r27 = hips.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(34, 64).addBox(-0.154F, -4.3267F, -0.894F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, 0.7767F, 0.0F, 0.1309F));

		PartDefinition hips_r28 = hips.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(53, 85).addBox(-0.3218F, 0.253F, -1.3969F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, -0.0873F, 0.0F, 0.3491F));

		PartDefinition hips_r29 = hips.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(5, 87).addBox(-0.3218F, 2.3042F, -2.2338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(65, 21).addBox(-0.3218F, 2.3042F, -2.6338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, -0.2618F, 0.0F, 0.3491F));

		PartDefinition hips_r30 = hips.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(26, 39).addBox(-0.3218F, -0.1741F, -2.2632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, -0.3491F, 0.0F, 0.3491F));

		PartDefinition hips_r31 = hips.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(87, 24).addBox(-0.3218F, 0.5164F, -2.352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, -0.2182F, 0.0F, 0.3491F));

		PartDefinition hips_r32 = hips.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(87, 21).addBox(-0.3218F, 2.2006F, -1.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, -0.6981F, 0.0F, 0.3491F));

		PartDefinition hips_r33 = hips.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(61, 95).addBox(-0.3218F, 1.0466F, -2.1225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, -0.1745F, 0.0F, 0.3491F));

		PartDefinition hips_r34 = hips.addOrReplaceChild("hips_r34", CubeListBuilder.create().texOffs(15, 84).addBox(-0.3218F, -0.354F, -2.0864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(87, 8).addBox(-0.3218F, 2.5155F, 1.5329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, 0.2618F, 0.0F, 0.3491F));

		PartDefinition hips_r35 = hips.addOrReplaceChild("hips_r35", CubeListBuilder.create().texOffs(0, 66).addBox(-0.3218F, 0.2495F, -0.1249F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, -0.6109F, 0.0F, 0.3491F));

		PartDefinition hips_r36 = hips.addOrReplaceChild("hips_r36", CubeListBuilder.create().texOffs(97, 64).addBox(-0.3218F, 1.9215F, -0.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, 0.0873F, 0.0F, 0.3491F));

		PartDefinition hips_r37 = hips.addOrReplaceChild("hips_r37", CubeListBuilder.create().texOffs(73, 42).addBox(-0.3218F, 1.7057F, 0.7483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, -0.1222F, 0.0F, 0.3491F));

		PartDefinition hips_r38 = hips.addOrReplaceChild("hips_r38", CubeListBuilder.create().texOffs(97, 70).addBox(-0.3218F, 3.2016F, 1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, 0.6458F, 0.0F, 0.3491F));

		PartDefinition hips_r39 = hips.addOrReplaceChild("hips_r39", CubeListBuilder.create().texOffs(97, 51).addBox(-0.3218F, 3.1048F, -0.3197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, 0.9948F, 0.0F, 0.3491F));

		PartDefinition hips_r40 = hips.addOrReplaceChild("hips_r40", CubeListBuilder.create().texOffs(43, 62).addBox(-0.3218F, 0.2864F, -0.6695F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, 0.7767F, 0.0F, 0.3491F));

		PartDefinition hips_r41 = hips.addOrReplaceChild("hips_r41", CubeListBuilder.create().texOffs(54, 30).addBox(-0.154F, -0.662F, -1.5605F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, 0.4276F, 0.0F, 0.1309F));

		PartDefinition hips_r42 = hips.addOrReplaceChild("hips_r42", CubeListBuilder.create().texOffs(5, 83).addBox(-0.154F, -2.776F, 0.0533F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, -0.096F, 0.0F, 0.1309F));

		PartDefinition hips_r43 = hips.addOrReplaceChild("hips_r43", CubeListBuilder.create().texOffs(45, 25).addBox(-0.183F, -2.8407F, -2.0738F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.129F, 3.4336F, 4.9446F, 0.1658F, 0.0F, 0.1309F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(32, 19).addBox(-0.5F, -0.559F, 0.0344F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(32, 33).addBox(0.5F, -0.059F, 0.0344F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(32, 33).mirror().addBox(-1.5F, -0.059F, 0.0344F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2009F, 6.4908F, -0.1394F, 0.2161F, -0.0301F));

		PartDefinition tail4_r1 = tail1.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(75, 90).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.559F, 4.0344F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(72, 90).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.559F, 2.0344F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail4_r2 = tail1.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(97, 83).addBox(0.0F, 0.8488F, 1.8618F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 98).addBox(0.0F, 0.1488F, -0.1382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.441F, 1.1344F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(69, 90).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.459F, 0.0344F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 19).addBox(-0.5F, -0.492F, -0.0388F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0653F, 5.0247F, -0.1201F, 0.26F, -0.031F));

		PartDefinition tail5_r1 = tail2.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(97, 76).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, 4.9612F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4_r3 = tail2.addOrReplaceChild("tail4_r3", CubeListBuilder.create().texOffs(37, 69).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, 2.9612F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3_r2 = tail2.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(30, 65).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, 0.9612F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail7_r1 = tail2.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(96, 97).addBox(0.0F, 2.7488F, 7.8618F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 97).addBox(0.0F, 2.3488F, 5.8618F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 87).addBox(0.0F, 1.7488F, 3.8618F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5063F, -3.8902F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 10).addBox(-0.5F, -0.6302F, 0.0376F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F))
				.texOffs(54, 35).addBox(0.0F, -1.5302F, 1.0376F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 43).addBox(0.0F, -1.1302F, 3.0376F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1355F, 5.7658F, -0.2968F, 0.3771F, -0.1122F));

		PartDefinition tail9_r1 = tail3.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(98, 41).addBox(0.0F, 4.2488F, 11.8618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 98).addBox(0.0F, 3.9488F, 9.8618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3708F, -9.656F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 3.4218F, 5.098F, -0.4466F, -0.2139F, -0.0409F));

		PartDefinition cube_r1 = leftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(93, 91).addBox(-0.5F, -0.9981F, -0.9886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.8421F, -0.6258F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 78).addBox(-1.5F, -0.0966F, 0.2895F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -0.1768F, 0.043F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 60).addBox(-1.5F, -0.75F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 0.0232F, -0.557F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(77, 56).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(79, 0).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -1.1575F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 79).addBox(-0.5F, -2.9665F, -1.2152F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, -0.1575F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 55).addBox(-1.0F, -2.0673F, -0.007F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 10.3003F, -0.5503F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 56).addBox(-1.0F, -2.0178F, 0.0088F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 9.2861F, -2.5841F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, 1.3F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 7.9404F, -0.9985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 62).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1714F, -0.7835F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(80, 79).addBox(-0.5F, -0.258F, -0.1653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.2822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(46, 70).addBox(-0.5F, -0.1024F, -0.0009F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.5575F, -1.3662F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2995F, -1.5846F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 75).addBox(-1.3F, -0.7F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 75).addBox(-1.3F, -0.7F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 74).addBox(-1.3F, -0.031F, -0.9332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1048F, -0.7611F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(76, 46).addBox(-1.3F, -0.5928F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4745F, 0.3001F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(64, 46).addBox(-0.6F, -7.8112F, -0.7657F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(57, 35).addBox(-1.0F, 0.8778F, -0.7453F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(84, 17).addBox(-1.4F, -1.9627F, -0.9982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 2.3719F, 0.5445F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(96, 80).addBox(-0.3F, 0.4282F, 0.1958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(12, 72).addBox(-0.3F, 0.9282F, -0.4042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 6).addBox(-0.3F, -3.1718F, 0.0958F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 3.4409F, -0.5989F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(97, 15).addBox(-0.5F, -0.15F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 21).addBox(-0.5F, 0.15F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 18).addBox(-0.5F, -0.15F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(18, 97).addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.8F, -0.0176F, -0.0726F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(76, 96).addBox(-0.5F, -0.7975F, -1.3435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 95).addBox(-0.5F, -0.7975F, -0.7435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.7983F, 1.512F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(63, 72).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8F, 0.145F, 0.9011F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(41, 84).addBox(-0.5F, -1.0F, 0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.8F, 4.3622F, -0.7465F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 84).addBox(-0.5F, -1.5F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.8F, 4.3622F, -0.7465F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(66, 66).addBox(-1.4F, -2.1718F, -0.0042F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 3.4409F, -0.5989F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(83, 93).addBox(-1.4F, 0.0297F, 0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 0.799F, -0.6771F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.338F, 0.0853F, -2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(45, 32).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftLeg3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 3.908F, 0.255F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftArm6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(42, 49).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 3.4218F, 5.098F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(94, 0).addBox(-0.5F, -0.9981F, -0.9886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.8421F, -0.6258F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(52, 78).addBox(-0.5F, -0.0966F, 0.2895F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.1768F, 0.043F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(60, 53).addBox(-0.5F, -0.75F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, 0.0232F, -0.557F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 78).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.4575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(12, 79).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -1.1575F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(59, 79).addBox(-0.5F, -2.9665F, -1.2152F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, -0.1575F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(56, 15).addBox(-1.0F, -2.0673F, -0.007F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 10.3003F, -0.5503F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -2.0178F, 0.0088F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 9.2861F, -2.5841F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(58, 8).addBox(-1.0F, 1.3F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 7.9404F, -0.9985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(67, 2).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.1714F, -0.7835F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.258F, -0.1653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.3652F, -1.2822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(51, 70).addBox(-0.5F, -0.1024F, -0.0009F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.5575F, -1.3662F, -0.0087F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2995F, -1.5846F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 76).addBox(-0.7F, -0.7F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(12, 76).addBox(-0.7F, -0.7F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7255F, 1.2001F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(70, 74).addBox(-0.7F, -0.031F, -0.9332F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1048F, -0.7611F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(76, 49).addBox(-0.7F, -0.5928F, -0.9772F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4745F, 0.3001F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(65, 14).addBox(-0.4F, -7.8112F, -0.7657F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.9F, 7.6263F, -0.2702F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(57, 39).addBox(-1.0F, 0.8778F, -0.7453F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.5131F, -0.3404F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(36, 84).addBox(0.4F, -1.9627F, -0.9982F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6F, 2.3719F, 0.5445F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(8, 97).addBox(-0.7F, 0.4282F, 0.1958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(73, 34).addBox(-0.7F, 0.9282F, -0.4042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 72).addBox(-0.7F, -3.1718F, 0.0958F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 3.4409F, -0.5989F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(34, 97).addBox(-0.5F, -0.15F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 32).addBox(-0.5F, 0.15F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 29).addBox(-0.5F, -0.15F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(29, 97).addBox(-0.5F, -0.15F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.8F, -0.0176F, -0.0726F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(97, 6).addBox(-0.5F, -0.7975F, -1.3435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 96).addBox(-0.5F, -0.7975F, -0.7435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 0.7983F, 1.512F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(28, 73).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.8F, 0.145F, 0.9011F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(84, 55).addBox(-0.5F, -1.0F, 0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.8F, 4.3622F, -0.7465F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightLeg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, -1.5F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.8F, 4.3622F, -0.7465F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r53 = rightLeg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(67, 6).addBox(0.4F, -2.1718F, -0.0042F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, 3.4409F, -0.5989F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 3).addBox(0.4F, 0.0297F, 0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6F, 0.799F, -0.6771F, 0.2967F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.338F, 0.0853F, -2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r55 = rightLeg3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(33, 45).addBox(-1.5F, -0.5F, -0.3F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.4103F, -0.1519F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightLeg3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 3.908F, 0.255F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r56 = rightArm6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(51, 2).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1908F, -1.0908F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(45, 90).addBox(0.0F, -3.0065F, -0.0226F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4687F, -0.8658F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(28, 90).addBox(0.0F, -3.1309F, -0.8501F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2687F, -2.0658F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(25, 90).addBox(0.0F, -2.4164F, -0.1021F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8687F, -4.7658F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -2.0827F, -0.0122F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7313F, -4.0658F, 0.2007F, 0.0F, 0.0F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(32, 26).addBox(-0.5F, -0.1269F, -0.0027F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8687F, -4.8658F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(87, 63).mirror().addBox(-2.6229F, -1.1114F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.115F, -0.4408F, 0.0566F, 0.0705F, -1.2921F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(85, 35).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.115F, -0.4408F, 0.1218F, 0.0123F, -0.7501F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(85, 67).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -2.3408F, 0.1435F, 0.1689F, -1.1944F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(85, 33).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -2.3408F, 0.2464F, 0.0525F, -0.6588F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(85, 31).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -4.3408F, 0.3298F, 0.0789F, -0.5486F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(27, 85).mirror().addBox(-4.5818F, -2.7739F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -4.3408F, 0.0566F, 0.3034F, -1.6166F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(85, 65).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -4.3408F, 0.203F, 0.2339F, -1.0778F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(85, 35).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.115F, -0.4408F, 0.1218F, -0.0123F, 0.7501F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(87, 63).addBox(1.6229F, -1.1114F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.115F, -0.4408F, 0.0566F, -0.0705F, 1.2921F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(85, 33).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.315F, -2.3408F, 0.2464F, -0.0525F, 0.6588F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(85, 67).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.315F, -2.3408F, 0.1435F, -0.1689F, 1.1944F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(85, 65).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -4.3408F, 0.203F, -0.2339F, 1.0778F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(27, 85).addBox(2.5818F, -2.7739F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -4.3408F, 0.0566F, -0.3034F, 1.6166F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(85, 31).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -4.3408F, 0.3298F, -0.0789F, 0.5486F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5687F, -4.8658F, 0.0038F, -0.0872F, -0.0438F));

		PartDefinition body_r6 = body2.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(6, 90).addBox(0.0F, -2.1117F, -0.9932F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.8F, 0.0611F, 0.0F, 0.0F));

		PartDefinition body_r7 = body2.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(3, 90).addBox(0.0F, -2.1943F, -3.0253F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body_r8 = body2.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(89, 87).addBox(0.0F, -2.3286F, -5.0567F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.5F, -0.0286F, -6.0567F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.8F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(84, 83).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.475F, 0.4135F, 0.1047F, -0.4885F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(85, 61).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.475F, 0.2643F, 0.298F, -1.0093F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-5.5818F, -2.7739F, -0.5307F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.475F, 0.0752F, 0.3889F, -1.558F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-6.5818F, -2.7739F, -0.5307F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -3.275F, 0.0752F, 0.3889F, -1.4882F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(85, 59).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -3.275F, 0.2643F, 0.298F, -0.9395F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -3.275F, 0.4135F, 0.1047F, -0.4187F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(51, 51).mirror().addBox(-7.5818F, -2.7739F, -0.5307F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3537F, -5.275F, 0.0951F, 0.4743F, -1.4449F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(85, 53).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3537F, -5.275F, 0.3281F, 0.3611F, -0.8839F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(82, 29).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3537F, -5.275F, 0.4977F, 0.1299F, -0.374F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-7.5818F, -2.7739F, -0.5307F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6537F, -7.275F, 0.1079F, 0.5254F, -1.3864F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(85, 51).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6537F, -7.275F, 0.3678F, 0.3983F, -0.8168F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6537F, -7.275F, 0.5484F, 0.1445F, -0.3147F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 32).addBox(2.5818F, -2.7739F, -0.5307F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.475F, 0.0752F, -0.3889F, 1.558F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(85, 61).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.475F, 0.2643F, -0.298F, 1.0093F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(84, 83).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.475F, 0.4135F, -0.1047F, 0.4885F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(82, 76).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -3.275F, 0.4135F, -0.1047F, 0.4187F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(85, 59).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -3.275F, 0.2643F, -0.298F, 0.9395F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(58, 12).addBox(2.5818F, -2.7739F, -0.5307F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -3.275F, 0.0752F, -0.3889F, 1.4882F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(82, 29).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3537F, -5.275F, 0.4977F, -0.1299F, 0.374F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(85, 53).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3537F, -5.275F, 0.3281F, -0.3611F, 0.8839F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(51, 51).addBox(2.5818F, -2.7739F, -0.5307F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3537F, -5.275F, 0.0951F, -0.4743F, 1.4449F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(80, 63).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6537F, -7.275F, 0.5484F, -0.1445F, 0.3147F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(85, 51).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6537F, -7.275F, 0.3678F, -0.3983F, 0.8168F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(9, 52).addBox(2.5818F, -2.7739F, -0.5307F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6537F, -7.275F, 0.1079F, -0.5254F, 1.3864F));

		PartDefinition body_r9 = body2.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(41, 93).addBox(0.0F, -2.4617F, -0.0047F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body_r10 = body2.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0799F, -6.9289F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3F, 0.8F, 0.2007F, 0.0F, 0.0F));

		PartDefinition body_r11 = body2.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.2792F, -0.0049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bodyfront = body2.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7045F, -8.8635F, 0.3171F, -0.0829F, -0.0272F));

		PartDefinition Front_r1 = bodyfront.addOrReplaceChild("Front_r1", CubeListBuilder.create().texOffs(50, 62).mirror().addBox(-3.4878F, -1.0352F, -1.6811F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.7251F, 4.7855F, -10.643F, -0.6586F, 0.4702F, 0.9749F));

		PartDefinition Front_r2 = bodyfront.addOrReplaceChild("Front_r2", CubeListBuilder.create().texOffs(21, 8).mirror().addBox(-6.9053F, -0.0761F, -0.3373F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.5445F, -0.9647F, -0.2926F, 1.0132F, 0.1266F));

		PartDefinition Front_r3 = bodyfront.addOrReplaceChild("Front_r3", CubeListBuilder.create().texOffs(36, 5).mirror().addBox(-5.9053F, -0.0761F, -0.3373F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.5445F, -0.9647F, -0.1807F, 0.8174F, 0.2624F));

		PartDefinition Front_r4 = bodyfront.addOrReplaceChild("Front_r4", CubeListBuilder.create().texOffs(51, 49).mirror().addBox(-4.9053F, -0.0761F, -0.3373F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.5445F, -0.9647F, -0.1608F, 0.5047F, 0.3096F));

		PartDefinition Front_r5 = bodyfront.addOrReplaceChild("Front_r5", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-4.7132F, 0.0604F, -0.248F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.2445F, -2.0647F, -0.1331F, 0.3803F, 0.3689F));

		PartDefinition Front_r6 = bodyfront.addOrReplaceChild("Front_r6", CubeListBuilder.create().texOffs(38, 7).mirror().addBox(-4.3305F, 0.1257F, -0.3686F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.8445F, -3.8647F, -0.4796F, 0.5366F, 0.3876F));

		PartDefinition Front_r7 = bodyfront.addOrReplaceChild("Front_r7", CubeListBuilder.create().texOffs(69, 54).mirror().addBox(-2.8484F, 0.2619F, -0.6624F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.6445F, -7.1647F, -0.3115F, 0.6417F, 0.6881F));

		PartDefinition Front_r8 = bodyfront.addOrReplaceChild("Front_r8", CubeListBuilder.create().texOffs(53, 46).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.4445F, -5.7647F, -0.4045F, 0.5927F, 0.5277F));

		PartDefinition Front_r9 = bodyfront.addOrReplaceChild("Front_r9", CubeListBuilder.create().texOffs(35, 51).mirror().addBox(-1.2894F, -1.2084F, -1.1958F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.7251F, 4.7855F, -10.643F, -0.7337F, -0.2228F, 1.0818F));

		PartDefinition cube_r95 = bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(85, 39).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7114F, -4.2016F, 0.4219F, 0.1073F, -0.3655F));

		PartDefinition cube_r96 = bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7114F, -4.2016F, 0.2706F, 0.3044F, -0.8852F));

		PartDefinition cube_r97 = bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-6.5818F, -2.7739F, -0.5307F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7114F, -4.2016F, 0.0771F, 0.3975F, -1.4351F));

		PartDefinition cube_r98 = bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(-7.5818F, -2.7739F, -0.5307F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4114F, -2.2016F, 0.0584F, 0.312F, -1.3718F));

		PartDefinition cube_r99 = bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4114F, -2.2016F, 0.209F, 0.2403F, -0.832F));

		PartDefinition cube_r100 = bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(85, 78).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4114F, -2.2016F, 0.3381F, 0.0815F, -0.3036F));

		PartDefinition cube_r101 = bodyfront.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(22, 52).mirror().addBox(-7.5818F, -2.7739F, -0.5307F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3114F, -0.1016F, 0.0407F, 0.2264F, -1.3765F));

		PartDefinition cube_r102 = bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(85, 69).mirror().addBox(-3.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3114F, -0.1016F, 0.1494F, 0.1755F, -0.8443F));

		PartDefinition cube_r103 = bodyfront.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(85, 37).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3114F, -0.1016F, 0.2547F, 0.0552F, -0.3093F));

		PartDefinition Front_r10 = bodyfront.addOrReplaceChild("Front_r10", CubeListBuilder.create().texOffs(50, 62).addBox(0.4878F, -1.0352F, -1.6811F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.7251F, 4.7855F, -10.643F, -0.6586F, -0.4702F, -0.9749F));

		PartDefinition Front_r11 = bodyfront.addOrReplaceChild("Front_r11", CubeListBuilder.create().texOffs(35, 51).addBox(-0.7106F, -1.2084F, -1.1958F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.7251F, 4.7855F, -10.643F, -0.7337F, 0.2228F, -1.0818F));

		PartDefinition Front_r12 = bodyfront.addOrReplaceChild("Front_r12", CubeListBuilder.create().texOffs(36, 10).addBox(-1.5F, -2.7529F, -3.1641F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 8.3979F, -8.899F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Front_r13 = bodyfront.addOrReplaceChild("Front_r13", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, -0.8187F, -0.1144F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 6.6979F, -7.999F, -0.48F, 0.0F, 0.0F));

		PartDefinition Front_r14 = bodyfront.addOrReplaceChild("Front_r14", CubeListBuilder.create().texOffs(69, 54).addBox(-0.1516F, 0.2619F, -0.6624F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.6445F, -7.1647F, -0.3115F, -0.6417F, -0.6881F));

		PartDefinition Front_r15 = bodyfront.addOrReplaceChild("Front_r15", CubeListBuilder.create().texOffs(21, 8).addBox(-0.0947F, -0.0761F, -0.3373F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.5445F, -0.9647F, -0.2926F, -1.0132F, -0.1266F));

		PartDefinition Front_r16 = bodyfront.addOrReplaceChild("Front_r16", CubeListBuilder.create().texOffs(36, 5).addBox(-0.0947F, -0.0761F, -0.3373F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.5445F, -0.9647F, -0.1807F, -0.8174F, -0.2624F));

		PartDefinition Front_r17 = bodyfront.addOrReplaceChild("Front_r17", CubeListBuilder.create().texOffs(51, 49).addBox(-0.0947F, -0.0761F, -0.3373F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.5445F, -0.9647F, -0.1608F, -0.5047F, -0.3096F));

		PartDefinition Front_r18 = bodyfront.addOrReplaceChild("Front_r18", CubeListBuilder.create().texOffs(49, 0).addBox(-0.2868F, 0.0604F, -0.248F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.2445F, -2.0647F, -0.1331F, -0.3803F, -0.3689F));

		PartDefinition Front_r19 = bodyfront.addOrReplaceChild("Front_r19", CubeListBuilder.create().texOffs(38, 7).addBox(-0.6695F, 0.1257F, -0.3686F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.8445F, -3.8647F, -0.4796F, -0.5366F, -0.3876F));

		PartDefinition Front_r20 = bodyfront.addOrReplaceChild("Front_r20", CubeListBuilder.create().texOffs(53, 46).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.4445F, -5.7647F, -0.4045F, -0.5927F, -0.5277F));

		PartDefinition Front_r21 = bodyfront.addOrReplaceChild("Front_r21", CubeListBuilder.create().texOffs(7, 68).addBox(-0.5F, -1.0428F, -0.0177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 7.7979F, -6.399F, -0.336F, 0.0F, 0.0F));

		PartDefinition Front_r22 = bodyfront.addOrReplaceChild("Front_r22", CubeListBuilder.create().texOffs(37, 39).addBox(-0.5F, -1.0235F, 0.0067F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 8.3979F, -4.524F, -0.2051F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(5, 95).addBox(0.0F, -3.0449F, -0.3761F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 89).addBox(0.0F, -3.3449F, 1.6239F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4485F, -2.4107F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bodyfront_r2 = bodyfront.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(51, 89).addBox(0.0F, -3.216F, -0.1669F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6485F, -4.7107F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bodyfront_r3 = bodyfront.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(17, 27).addBox(-0.5F, -0.9385F, 0.0114F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.2485F, -5.7107F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bodyfront.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(62, 0).addBox(2.5818F, -2.7739F, -0.5307F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7114F, -4.2016F, 0.0771F, -0.3975F, 1.4351F));

		PartDefinition cube_r105 = bodyfront.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(20, 86).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7114F, -4.2016F, 0.2706F, -0.3044F, 0.8852F));

		PartDefinition cube_r106 = bodyfront.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(85, 39).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7114F, -4.2016F, 0.4219F, -0.1073F, 0.3655F));

		PartDefinition cube_r107 = bodyfront.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(85, 78).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4114F, -2.2016F, 0.3381F, -0.0815F, 0.3036F));

		PartDefinition cube_r108 = bodyfront.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(85, 80).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4114F, -2.2016F, 0.209F, -0.2403F, 0.832F));

		PartDefinition cube_r109 = bodyfront.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(53, 44).addBox(2.5818F, -2.7739F, -0.5307F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4114F, -2.2016F, 0.0584F, -0.312F, 1.3718F));

		PartDefinition cube_r110 = bodyfront.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(85, 37).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3114F, -0.1016F, 0.2547F, -0.0552F, 0.3093F));

		PartDefinition cube_r111 = bodyfront.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(85, 69).addBox(1.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3114F, -0.1016F, 0.1494F, -0.1755F, 0.8443F));

		PartDefinition cube_r112 = bodyfront.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(22, 52).addBox(2.5818F, -2.7739F, -0.5307F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3114F, -0.1016F, 0.0407F, -0.2264F, 1.3765F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7485F, -5.7107F));

		PartDefinition bodyfront_r4 = chest.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(89, 16).addBox(0.0F, -2.9115F, -0.9046F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bodyfront_r5 = chest.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(89, 11).addBox(0.0F, -3.103F, 0.0697F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bodyfront_r6 = chest.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(97, 58).mirror().addBox(0.0173F, -1.6974F, -1.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.4445F, -2.9607F, 1.9993F, -0.3893F, -0.2027F));

		PartDefinition bodyfront_r7 = chest.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(93, 94).mirror().addBox(0.0173F, -2.0547F, -0.9797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.4445F, -2.9607F, 2.7411F, -0.3893F, -0.2027F));

		PartDefinition bodyfront_r8 = chest.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(27, 54).mirror().addBox(0.0173F, -1.6676F, -2.1468F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.4445F, -2.9607F, 2.4356F, -0.3893F, -0.2027F));

		PartDefinition bodyfront_r9 = chest.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(92, 67).mirror().addBox(0.0173F, -0.6652F, -1.1362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.4445F, -2.9607F, 1.4757F, -0.3893F, -0.2027F));

		PartDefinition bodyfront_r10 = chest.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(92, 64).mirror().addBox(0.0173F, -0.5955F, -0.914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.4445F, -2.9607F, 0.734F, -0.3893F, -0.2027F));

		PartDefinition bodyfront_r11 = chest.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-0.5F, -1.5173F, -2.1096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, 1.0036F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r12 = chest.addOrReplaceChild("bodyfront_r12", CubeListBuilder.create().texOffs(21, 70).mirror().addBox(-0.5F, -2.2827F, -1.7441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, 1.3963F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r13 = chest.addOrReplaceChild("bodyfront_r13", CubeListBuilder.create().texOffs(70, 20).mirror().addBox(-0.5F, -2.0257F, -0.0974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, 1.789F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r14 = chest.addOrReplaceChild("bodyfront_r14", CubeListBuilder.create().texOffs(60, 2).mirror().addBox(-0.5F, -2.1086F, -2.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, -1.1519F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r15 = chest.addOrReplaceChild("bodyfront_r15", CubeListBuilder.create().texOffs(92, 61).mirror().addBox(-0.5F, -3.616F, 0.6967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(69, 82).mirror().addBox(-0.5F, -3.877F, -0.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, -0.4974F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r16 = chest.addOrReplaceChild("bodyfront_r16", CubeListBuilder.create().texOffs(92, 58).mirror().addBox(-0.5F, -3.0974F, -0.8384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, -1.021F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r17 = chest.addOrReplaceChild("bodyfront_r17", CubeListBuilder.create().texOffs(92, 52).mirror().addBox(-0.5F, -3.9253F, -0.356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, -0.7592F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r18 = chest.addOrReplaceChild("bodyfront_r18", CubeListBuilder.create().texOffs(82, 25).mirror().addBox(-0.5F, -3.7647F, 0.0241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, -0.1484F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r19 = chest.addOrReplaceChild("bodyfront_r19", CubeListBuilder.create().texOffs(92, 49).mirror().addBox(-0.5F, -3.7482F, -0.584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, -0.0436F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r20 = chest.addOrReplaceChild("bodyfront_r20", CubeListBuilder.create().texOffs(48, 38).mirror().addBox(-0.5F, -2.737F, -0.4425F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 1.2445F, -1.0607F, 0.8727F, -0.2182F, 0.1571F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(46, 85).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0371F, -2.4909F, 0.5359F, 0.2462F, -0.6509F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0371F, -2.4909F, 0.3006F, 0.4807F, -1.1793F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(84, 85).mirror().addBox(-4.5818F, -2.7739F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0371F, -2.4909F, -0.0045F, 0.5607F, -1.7784F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 60).mirror().addBox(-5.5818F, -2.7739F, -0.5307F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0629F, -0.4909F, 0.0972F, 0.4828F, -1.5487F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(87, 4).mirror().addBox(-3.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0629F, -0.4909F, 0.3347F, 0.3673F, -0.9863F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(85, 41).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0629F, -0.4909F, 0.5061F, 0.1323F, -0.4776F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(84, 85).addBox(2.5818F, -2.7739F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0371F, -2.4909F, -0.0045F, -0.5607F, 1.7784F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(87, 6).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0371F, -2.4909F, 0.3006F, -0.4807F, 1.1793F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(46, 85).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0371F, -2.4909F, 0.5359F, -0.2462F, 0.6509F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(70, 60).addBox(2.5818F, -2.7739F, -0.5307F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0629F, -0.4909F, 0.0972F, -0.4828F, 1.5487F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(87, 4).addBox(1.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0629F, -0.4909F, 0.3347F, -0.3673F, 0.9863F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(85, 41).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0629F, -0.4909F, 0.5061F, -0.1323F, 0.4776F));

		PartDefinition bodyfront_r21 = chest.addOrReplaceChild("bodyfront_r21", CubeListBuilder.create().texOffs(92, 61).addBox(-0.5F, -3.616F, 0.6967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F))
				.texOffs(69, 82).addBox(-0.5F, -3.877F, -0.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, -0.4974F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r22 = chest.addOrReplaceChild("bodyfront_r22", CubeListBuilder.create().texOffs(60, 2).addBox(-0.5F, -2.1086F, -2.1157F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, -1.1519F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r23 = chest.addOrReplaceChild("bodyfront_r23", CubeListBuilder.create().texOffs(92, 58).addBox(-0.5F, -3.0974F, -0.8384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, -1.021F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r24 = chest.addOrReplaceChild("bodyfront_r24", CubeListBuilder.create().texOffs(92, 52).addBox(-0.5F, -3.9253F, -0.356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, -0.7592F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r25 = chest.addOrReplaceChild("bodyfront_r25", CubeListBuilder.create().texOffs(82, 25).addBox(-0.5F, -3.7647F, 0.0241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, -0.1484F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r26 = chest.addOrReplaceChild("bodyfront_r26", CubeListBuilder.create().texOffs(92, 49).addBox(-0.5F, -3.7482F, -0.584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, -0.0436F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r27 = chest.addOrReplaceChild("bodyfront_r27", CubeListBuilder.create().texOffs(70, 24).addBox(-0.5F, -1.5173F, -2.1096F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, 1.0036F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r28 = chest.addOrReplaceChild("bodyfront_r28", CubeListBuilder.create().texOffs(97, 58).addBox(-1.0173F, -1.6974F, -1.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.1F, 2.4445F, -2.9607F, 1.9993F, 0.3893F, 0.2027F));

		PartDefinition bodyfront_r29 = chest.addOrReplaceChild("bodyfront_r29", CubeListBuilder.create().texOffs(93, 94).addBox(-1.0173F, -2.0547F, -0.9797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.1F, 2.4445F, -2.9607F, 2.7411F, 0.3893F, 0.2027F));

		PartDefinition bodyfront_r30 = chest.addOrReplaceChild("bodyfront_r30", CubeListBuilder.create().texOffs(27, 54).addBox(-1.0173F, -1.6676F, -2.1468F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.1F, 2.4445F, -2.9607F, 2.4356F, 0.3893F, 0.2027F));

		PartDefinition bodyfront_r31 = chest.addOrReplaceChild("bodyfront_r31", CubeListBuilder.create().texOffs(92, 67).addBox(-1.0173F, -0.6652F, -1.1362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(3.1F, 2.4445F, -2.9607F, 1.4757F, 0.3893F, 0.2027F));

		PartDefinition bodyfront_r32 = chest.addOrReplaceChild("bodyfront_r32", CubeListBuilder.create().texOffs(92, 64).addBox(-1.0173F, -0.5955F, -0.914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1F, 2.4445F, -2.9607F, 0.734F, 0.3893F, 0.2027F));

		PartDefinition bodyfront_r33 = chest.addOrReplaceChild("bodyfront_r33", CubeListBuilder.create().texOffs(21, 70).addBox(-0.5F, -2.2827F, -1.7441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, 1.3963F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r34 = chest.addOrReplaceChild("bodyfront_r34", CubeListBuilder.create().texOffs(70, 20).addBox(-0.5F, -2.0257F, -0.0974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, 1.789F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r35 = chest.addOrReplaceChild("bodyfront_r35", CubeListBuilder.create().texOffs(48, 38).addBox(-0.5F, -2.737F, -0.4425F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8F, 1.2445F, -1.0607F, 0.8727F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r36 = chest.addOrReplaceChild("bodyfront_r36", CubeListBuilder.create().texOffs(9, 54).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9452F, 4.9988F, -2.8445F, 0.5658F, -0.009F, -0.0068F));

		PartDefinition cube_r125 = leftarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(63, 76).addBox(-1.0F, -0.35F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.6838F, 1.1151F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftarm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(77, 18).addBox(-1.0F, 1.425F, -1.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8609F, 1.9677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftarm.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(74, 83).addBox(0.5009F, -0.0997F, -0.4406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0119F, -0.2961F, 0.0756F, -0.6895F, 0.0014F, -0.001F));

		PartDefinition cube_r128 = leftarm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(83, 47).addBox(0.5F, -0.3F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0119F, -0.2961F, -0.5244F, -0.3404F, 0.0014F, -0.001F));

		PartDefinition cube_r129 = leftarm.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(92, 88).addBox(-0.0047F, -0.0439F, -0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.9673F, 0.1378F, 0.445F, 0.0015F, -0.0008F));

		PartDefinition cube_r130 = leftarm.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(83, 43).addBox(-0.0047F, -2.0439F, -0.0015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 4.9673F, 0.1378F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r131 = leftarm.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(17, 80).addBox(-0.4992F, -0.0295F, -0.0451F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0098F, 2.8347F, -1.4751F, 0.8071F, 0.0014F, -0.001F));

		PartDefinition cube_r132 = leftarm.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(70, 28).addBox(-0.5006F, -0.0815F, -0.0088F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0098F, 1.9347F, -1.7751F, 0.2835F, 0.0014F, -0.001F));

		PartDefinition cube_r133 = leftarm.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(71, 95).addBox(-0.5F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0098F, 1.3597F, -1.0001F, -0.3055F, 0.0014F, -0.001F));

		PartDefinition cube_r134 = leftarm.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(77, 5).addBox(-0.5F, -1.2725F, -0.0373F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 5.0418F, 0.0908F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftarm.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(75, 79).addBox(-0.5F, -2.0538F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5668F, 1.5408F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(93, 42).addBox(-0.5F, -0.0198F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8719F, 1.6773F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r137 = leftarm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(88, 92).addBox(-0.5F, -1.9926F, -0.8121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7968F, 2.0023F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r138 = leftarm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(26, 35).addBox(0.0F, -0.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.1885F, 0.4014F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r139 = leftarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(66, 95).addBox(0.0F, 0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.2202F, 1.2568F, -1.6513F, -0.2201F, 0.2252F));

		PartDefinition cube_r140 = leftarm2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(24, 95).addBox(-0.5378F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.8461F, 1.1201F, 1.5708F, 0.1396F, -1.5708F));

		PartDefinition cube_r141 = leftarm2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(78, 93).addBox(0.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(93, 45).addBox(0.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, 1.1298F, -0.0451F, 1.5708F, -1.1083F, -1.5708F));

		PartDefinition cube_r142 = leftarm2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(64, 83).addBox(-1.3599F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.8702F, 1.3549F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r143 = leftarm2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(77, 74).addBox(-0.3985F, -0.2752F, -0.0824F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.1764F, 1.5704F, -0.4664F, 1.5708F, -1.4486F, -1.6232F));

		PartDefinition cube_r144 = leftarm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(80, 59).addBox(-0.675F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6302F, 0.8895F, -0.4802F, 1.5708F, -1.1694F, -1.6232F));

		PartDefinition cube_r145 = leftarm2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(46, 87).addBox(-0.775F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(27, 87).addBox(-0.775F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.6302F, 0.8895F, -0.4802F, -1.5708F, -1.1868F, 1.5184F));

		PartDefinition cube_r146 = leftarm2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(74, 0).addBox(-0.0572F, -0.0033F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 1.6454F, 0.0086F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 4.7604F, 0.5027F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftArm3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(23, 65).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 2.8612F, 0.1106F, 0.772F, -0.3042F, 0.0303F));

		PartDefinition cube_r148 = leftArm4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(36, 15).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftArm5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(13, 35).addBox(-1.5F, -0.35F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9452F, 4.9988F, -2.8445F, -0.276F, 0.1362F, 0.4256F));

		PartDefinition cube_r150 = rightarm.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(77, 15).addBox(-1.0F, -0.35F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.6838F, 1.1151F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r151 = rightarm.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(19, 77).addBox(-1.0F, 1.425F, -1.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.8609F, 1.9677F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r152 = rightarm.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(10, 84).addBox(-1.5009F, -0.0997F, -0.4406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0119F, -0.2961F, 0.0756F, -0.6895F, -0.0014F, 0.001F));

		PartDefinition cube_r153 = rightarm.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(84, 0).addBox(-1.5F, -0.3F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0119F, -0.2961F, -0.5244F, -0.3404F, -0.0014F, 0.001F));

		PartDefinition cube_r154 = rightarm.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(19, 94).addBox(-0.9953F, -0.0439F, -0.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.9673F, 0.1378F, 0.445F, -0.0015F, 0.0008F));

		PartDefinition cube_r155 = rightarm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(79, 83).addBox(-0.9953F, -2.0439F, -0.0015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 4.9673F, 0.1378F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r156 = rightarm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(80, 35).addBox(-0.5008F, -0.0295F, -0.0451F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0098F, 2.8347F, -1.4751F, 0.8071F, -0.0014F, 0.001F));

		PartDefinition cube_r157 = rightarm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(56, 71).addBox(-0.4994F, -0.0815F, -0.0088F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0098F, 1.9347F, -1.7751F, 0.2835F, -0.0014F, 0.001F));

		PartDefinition cube_r158 = rightarm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(97, 12).addBox(-0.5F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0098F, 1.3597F, -1.0001F, -0.3055F, -0.0014F, 0.001F));

		PartDefinition cube_r159 = rightarm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(77, 10).addBox(-0.5F, -1.2725F, -0.0373F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 5.0418F, 0.0908F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r160 = rightarm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(80, 31).addBox(-0.5F, -2.0538F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5668F, 1.5408F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r161 = rightarm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(14, 94).addBox(-0.5F, -0.0198F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 5.8719F, 1.6773F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r162 = rightarm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(9, 94).addBox(-0.5F, -1.9926F, -0.8121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7968F, 2.0023F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r163 = rightarm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(64, 79).addBox(-1.0F, -0.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.1885F, 0.4014F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r164 = rightarm.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(97, 9).addBox(-1.0F, 0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.0915F, 0.2726F, 0.0262F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.2202F, 1.2568F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r165 = rightarm2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(44, 95).addBox(-0.4622F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -0.8461F, 1.1201F, 1.5708F, -0.1396F, 1.5708F));

		PartDefinition cube_r166 = rightarm2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(31, 94).addBox(-1.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(94, 26).addBox(-1.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.136F, 1.1298F, -0.0451F, 1.5708F, 1.1083F, 1.5708F));

		PartDefinition cube_r167 = rightarm2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(84, 13).addBox(0.3598F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -0.8702F, 1.3549F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r168 = rightarm2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(7, 78).addBox(-0.6015F, -0.2752F, -0.0824F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1764F, 1.5704F, -0.4664F, 1.5708F, 1.4486F, 1.6232F));

		PartDefinition cube_r169 = rightarm2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(31, 81).addBox(-0.325F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6302F, 0.8895F, -0.4802F, 1.5708F, 1.1694F, 1.6232F));

		PartDefinition cube_r170 = rightarm2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(87, 71).addBox(-0.225F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(63, 87).addBox(-0.225F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.6302F, 0.8895F, -0.4802F, -1.5708F, 1.1868F, -1.5184F));

		PartDefinition cube_r171 = rightarm2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(40, 74).addBox(-0.9428F, -0.0033F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 1.6454F, 0.0086F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 4.7604F, 0.5027F, -0.0828F, 0.7401F, -0.0559F));

		PartDefinition cube_r172 = rightArm3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(50, 65).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 2.8612F, 0.1106F, 0.8203F, 0.0002F, -0.0001F));

		PartDefinition cube_r173 = rightArm4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(56, 20).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0127F, 0.7642F, -1.4173F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r174 = rightArm5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, -0.35F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(57, 67).addBox(-0.5F, -0.5784F, -1.9889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0938F, -2.7609F, -0.3543F, 0.0F, 0.0F));

		PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(0, 89).addBox(0.0F, -3.0F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0216F, -1.0889F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_r2 = neck.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4216F, -1.9889F, -0.5509F, -0.3007F, 0.18F));

		PartDefinition neck_r3 = neck.addOrReplaceChild("neck_r3", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4216F, -1.9889F, -0.5509F, 0.3007F, -0.18F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0784F, -1.9889F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r175 = neck2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(42, 88).addBox(0.0F, -2.7F, -1.925F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 34).addBox(-0.5F, -0.5F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_r4 = neck2.addOrReplaceChild("neck_r4", CubeListBuilder.create().texOffs(16, 63).mirror().addBox(0.0001F, -0.4987F, 0.0004F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.0F, -0.5729F, -0.2277F, 0.1305F));

		PartDefinition neck_r5 = neck2.addOrReplaceChild("neck_r5", CubeListBuilder.create().texOffs(16, 63).addBox(-0.0001F, -0.4987F, 0.0004F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.0F, -0.5729F, 0.2277F, -0.1305F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.9F, 0.1745F, -0.1309F, 0.0F));

		PartDefinition cube_r176 = neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(20, 46).addBox(0.0F, -2.1809F, -1.0211F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -0.8F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck_r6 = neck3.addOrReplaceChild("neck_r6", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-0.0057F, -0.5223F, -0.0165F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -1.9F, -0.5679F, -0.1909F, 0.1064F));

		PartDefinition neck_r7 = neck3.addOrReplaceChild("neck_r7", CubeListBuilder.create().texOffs(63, 24).addBox(0.0057F, -0.5223F, -0.0165F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -1.9F, -0.5679F, 0.1909F, -0.1064F));

		PartDefinition cube_r177 = neck3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(14, 68).addBox(-0.5F, -0.45F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -1.9F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r178 = neck4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(41, 68).addBox(0.0F, -2.2977F, -1.7296F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck_r8 = neck4.addOrReplaceChild("neck_r8", CubeListBuilder.create().texOffs(63, 29).mirror().addBox(-0.0029F, -0.4752F, -0.0013F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -1.6F, -0.4766F, -0.1445F, 0.082F));

		PartDefinition neck_r9 = neck4.addOrReplaceChild("neck_r9", CubeListBuilder.create().texOffs(63, 29).addBox(0.0029F, -0.4752F, -0.0013F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.6F, -0.4766F, 0.1445F, -0.082F));

		PartDefinition cube_r179 = neck4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(13, 40).addBox(-0.5F, -0.375F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create().texOffs(19, 91).addBox(0.6F, -1.2838F, -3.4819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 55).addBox(0.825F, -1.2838F, -3.4819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 55).mirror().addBox(-1.825F, -1.2838F, -3.4819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(19, 91).mirror().addBox(-1.6F, -1.2838F, -3.4819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0212F, -3.5175F, 0.3976F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(9, 59).addBox(-1.5F, -0.0094F, 0.0173F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9627F, -3.3899F, -0.1004F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(54, 58).addBox(-1.5F, 0.0211F, 0.0169F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9627F, -4.3899F, 0.0305F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(36, 91).mirror().addBox(-0.5F, -0.6055F, -1.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0922F, -3.8118F, -0.0436F, -0.1309F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(57, 91).mirror().addBox(-0.5F, -0.5433F, -0.2915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(91, 82).mirror().addBox(-0.5F, -0.5433F, 0.1085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0922F, -3.8118F, -0.3491F, -0.1309F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(24, 45).mirror().addBox(-0.8514F, -1.6086F, -2.7977F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2375F, -0.2597F, 1.2328F, -0.0859F, -0.4584F, 0.0525F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(27, 59).mirror().addBox(0.0375F, -2.2907F, -3.6521F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, 0.1745F, -0.1571F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(30, 69).mirror().addBox(0.0375F, 1.2083F, -3.5246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, -0.2618F, -0.1571F, 0.0F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(53, 81).mirror().addBox(0.0375F, -0.2558F, -2.0531F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, 0.0F, -0.1571F, 0.0F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(74, 87).mirror().addBox(0.0375F, 0.128F, -0.9527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, 0.0175F, -0.1571F, 0.0F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(79, 87).mirror().addBox(0.0375F, 0.6285F, -0.7351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, -0.1833F, -0.1571F, 0.0F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(82, 5).mirror().addBox(0.0375F, -0.3931F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, 0.1222F, -0.1571F, 0.0F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(70, 77).mirror().addBox(0.0375F, -1.5721F, -1.1774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, -0.3054F, -0.1571F, 0.0F));

		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(48, 81).mirror().addBox(0.0375F, -1.5866F, -0.9367F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, -0.1571F, -0.1571F, 0.0F));

		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(77, 26).mirror().addBox(0.0375F, -1.7859F, -1.7975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 77).mirror().addBox(0.0375F, -1.7859F, -2.1975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, -0.0873F, -0.1571F, 0.0F));

		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(78, 69).mirror().addBox(-1.775F, -0.45F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6495F, -1.1975F, 0.0863F, 0.844F, -0.077F));

		PartDefinition head_r16 = head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-0.0375F, -1.2134F, 0.0956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, 2.3998F, -0.1571F, 0.0F));

		PartDefinition head_r17 = head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(32, 88).mirror().addBox(-0.0375F, -0.1237F, 0.1887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, 2.9234F, -0.1571F, 0.0F));

		PartDefinition head_r18 = head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(37, 88).mirror().addBox(-0.0375F, 0.7144F, -0.6099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, -2.4435F, -0.1571F, 0.0F));

		PartDefinition head_r19 = head.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(88, 43).mirror().addBox(-0.0375F, 0.7715F, -1.6502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, -1.6581F, -0.1571F, 0.0F));

		PartDefinition head_r20 = head.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(84, 87).mirror().addBox(-0.0375F, -1.6262F, -2.2526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, 0.1309F, -0.1571F, 0.0F));

		PartDefinition head_r21 = head.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.0375F, -1.1938F, -2.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, 0.3927F, -0.1571F, 0.0F));

		PartDefinition head_r22 = head.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(70, 12).mirror().addBox(-0.0375F, 0.5482F, -2.3873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, -1.0472F, -0.1571F, 0.0F));

		PartDefinition head_r23 = head.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.0375F, -1.7089F, -1.0639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1375F, -0.2597F, 1.2328F, 1.309F, -0.1571F, 0.0F));

		PartDefinition head_r24 = head.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(78, 90).mirror().addBox(-1.5F, -0.0195F, -0.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 90).addBox(0.65F, -0.0195F, -0.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.075F, -0.6881F, -1.8447F, -0.6981F, 0.0F, 0.0F));

		PartDefinition head_r25 = head.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(89, 74).mirror().addBox(-1.5F, -0.0207F, -0.9623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(89, 74).addBox(0.65F, -0.0207F, -0.9623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.075F, -1.5381F, -2.3697F, 0.5323F, 0.0F, 0.0F));

		PartDefinition head_r26 = head.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(89, 55).mirror().addBox(-1.5F, -0.625F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 55).addBox(0.65F, -0.625F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.075F, -1.1131F, -3.2447F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head_r27 = head.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(14, 91).mirror().addBox(-1.5F, -0.9958F, -1.0091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(14, 91).addBox(0.65F, -0.9958F, -1.0091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.075F, -0.8881F, -3.7947F, -1.9853F, 0.0F, 0.0F));

		PartDefinition head_r28 = head.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(83, 90).mirror().addBox(-1.5F, 0.0203F, -1.0057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(9, 91).mirror().addBox(-1.5F, 0.3203F, -1.0057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 91).addBox(0.65F, 0.3203F, -1.0057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 90).addBox(0.65F, 0.0203F, -1.0057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.075F, 0.0619F, -2.4447F, -1.5359F, 0.0F, 0.0F));

		PartDefinition head_r29 = head.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(91, 82).addBox(-0.5F, -0.5433F, 0.1085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 91).addBox(-0.5F, -0.5433F, -0.2915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6F, 1.0922F, -3.8118F, -0.3491F, 0.1309F, 0.0F));

		PartDefinition head_r30 = head.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(36, 91).addBox(-0.5F, -0.6055F, -1.1007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.0922F, -3.8118F, -0.0436F, 0.1309F, 0.0F));

		PartDefinition head_r31 = head.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, -2.0081F, -1.7645F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.0373F, -2.4899F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head_r32 = head.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(30, 69).addBox(-1.0375F, 1.2083F, -3.5246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, -0.2618F, 0.1571F, 0.0F));

		PartDefinition head_r33 = head.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(74, 87).addBox(-1.0375F, 0.128F, -0.9527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, 0.0175F, 0.1571F, 0.0F));

		PartDefinition head_r34 = head.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(24, 45).addBox(-0.1486F, -1.6086F, -2.7977F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2375F, -0.2597F, 1.2328F, -0.0859F, 0.4584F, -0.0525F));

		PartDefinition head_r35 = head.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(48, 81).addBox(-1.0375F, -1.5866F, -0.9367F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, -0.1571F, 0.1571F, 0.0F));

		PartDefinition head_r36 = head.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(70, 77).addBox(-1.0375F, -1.5721F, -1.1774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, -0.3054F, 0.1571F, 0.0F));

		PartDefinition head_r37 = head.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(79, 87).addBox(-1.0375F, 0.6285F, -0.7351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, -0.1833F, 0.1571F, 0.0F));

		PartDefinition head_r38 = head.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(82, 5).addBox(-1.0375F, -0.3931F, -1.2523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, 0.1222F, 0.1571F, 0.0F));

		PartDefinition head_r39 = head.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(53, 81).addBox(-1.0375F, -0.2558F, -2.0531F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, 0.0F, 0.1571F, 0.0F));

		PartDefinition head_r40 = head.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(77, 26).addBox(-1.0375F, -1.7859F, -1.7975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 77).addBox(-1.0375F, -1.7859F, -2.1975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, -0.0873F, 0.1571F, 0.0F));

		PartDefinition head_r41 = head.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(27, 59).addBox(-1.0375F, -2.2907F, -3.6521F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, 0.1745F, 0.1571F, 0.0F));

		PartDefinition head_r42 = head.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(70, 12).addBox(-0.9625F, 0.5482F, -2.3873F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, -1.0472F, 0.1571F, 0.0F));

		PartDefinition head_r43 = head.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(88, 43).addBox(-0.9625F, 0.7715F, -1.6502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, -1.6581F, 0.1571F, 0.0F));

		PartDefinition head_r44 = head.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(37, 88).addBox(-0.9625F, 0.7144F, -0.6099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, -2.4435F, 0.1571F, 0.0F));

		PartDefinition head_r45 = head.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(32, 88).addBox(-0.9625F, -0.1237F, 0.1887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, 2.9234F, 0.1571F, 0.0F));

		PartDefinition head_r46 = head.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(20, 88).addBox(-0.9625F, -1.2134F, 0.0956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, 2.3998F, 0.1571F, 0.0F));

		PartDefinition head_r47 = head.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(15, 88).addBox(-0.9625F, -1.7089F, -1.0639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, 1.309F, 0.1571F, 0.0F));

		PartDefinition head_r48 = head.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(10, 88).addBox(-0.9625F, -1.1938F, -2.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, 0.3927F, 0.1571F, 0.0F));

		PartDefinition head_r49 = head.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(84, 87).addBox(-0.9625F, -1.6262F, -2.2526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1375F, -0.2597F, 1.2328F, 0.1309F, 0.1571F, 0.0F));

		PartDefinition head_r50 = head.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(78, 69).addBox(-0.225F, -0.45F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6495F, -1.1975F, 0.0863F, -0.844F, 0.077F));

		PartDefinition head_r51 = head.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(42, 45).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.5627F, -1.6899F, 0.1745F, 0.0F, 0.0F));

		PartDefinition lowerjaw1 = head.addOrReplaceChild("lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4216F, 1.0267F, 0.6887F, 0.0F, 0.0F));

		PartDefinition lowerjaw5_r1 = lowerjaw1.addOrReplaceChild("lowerjaw5_r1", CubeListBuilder.create().texOffs(22, 82).mirror().addBox(-0.5F, -0.7108F, -4.3533F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, 0.3077F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw7_r1 = lowerjaw1.addOrReplaceChild("lowerjaw7_r1", CubeListBuilder.create().texOffs(73, 62).mirror().addBox(-0.5F, 3.5363F, 0.3508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, -1.2107F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw6_r1 = lowerjaw1.addOrReplaceChild("lowerjaw6_r1", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-0.5F, 3.1635F, -1.1371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, -0.8267F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw5_r2 = lowerjaw1.addOrReplaceChild("lowerjaw5_r2", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-0.5F, 1.5034F, -3.0749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(82, 21).mirror().addBox(-0.5F, -0.1216F, -3.4249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, 0.1332F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw4_r1 = lowerjaw1.addOrReplaceChild("lowerjaw4_r1", CubeListBuilder.create().texOffs(92, 17).mirror().addBox(-0.5F, 1.0374F, -2.395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0012F)).mirror(false)
				.texOffs(92, 14).mirror().addBox(-0.5F, 0.3374F, -2.395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, -0.0588F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw6_r2 = lowerjaw1.addOrReplaceChild("lowerjaw6_r2", CubeListBuilder.create().texOffs(66, 38).mirror().addBox(-0.5F, -0.5178F, -3.514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, 0.7615F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw5_r3 = lowerjaw1.addOrReplaceChild("lowerjaw5_r3", CubeListBuilder.create().texOffs(92, 11).mirror().addBox(-0.5F, 0.6887F, -0.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, -0.0501F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw4_r2 = lowerjaw1.addOrReplaceChild("lowerjaw4_r2", CubeListBuilder.create().texOffs(36, 94).mirror().addBox(-0.5F, 0.0279F, -1.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, 0.8662F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw3_r1 = lowerjaw1.addOrReplaceChild("lowerjaw3_r1", CubeListBuilder.create().texOffs(92, 8).mirror().addBox(-0.5F, 0.0444F, -0.87F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, 0.3863F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw2_r1 = lowerjaw1.addOrReplaceChild("lowerjaw2_r1", CubeListBuilder.create().texOffs(88, 46).mirror().addBox(-0.5F, 0.26F, -1.4857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.26F, -0.0143F, -0.0064F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw5_r4 = lowerjaw1.addOrReplaceChild("lowerjaw5_r4", CubeListBuilder.create().texOffs(66, 38).addBox(-0.5F, -0.5178F, -3.514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, 0.7615F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw4_r3 = lowerjaw1.addOrReplaceChild("lowerjaw4_r3", CubeListBuilder.create().texOffs(92, 11).addBox(-0.5F, 0.6887F, -0.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, -0.0501F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw3_r2 = lowerjaw1.addOrReplaceChild("lowerjaw3_r2", CubeListBuilder.create().texOffs(36, 94).addBox(-0.5F, 0.0279F, -1.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, 0.8662F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw2_r2 = lowerjaw1.addOrReplaceChild("lowerjaw2_r2", CubeListBuilder.create().texOffs(92, 8).addBox(-0.5F, 0.0444F, -0.87F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, 0.3863F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw6_r3 = lowerjaw1.addOrReplaceChild("lowerjaw6_r3", CubeListBuilder.create().texOffs(73, 62).addBox(-0.5F, 3.5363F, 0.3508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, -1.2107F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw5_r5 = lowerjaw1.addOrReplaceChild("lowerjaw5_r5", CubeListBuilder.create().texOffs(73, 38).addBox(-0.5F, 3.1635F, -1.1371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, -0.8267F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw4_r4 = lowerjaw1.addOrReplaceChild("lowerjaw4_r4", CubeListBuilder.create().texOffs(92, 20).addBox(-0.5F, 1.5034F, -3.0749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(82, 21).addBox(-0.5F, -0.1216F, -3.4249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, 0.1332F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw4_r5 = lowerjaw1.addOrReplaceChild("lowerjaw4_r5", CubeListBuilder.create().texOffs(22, 82).addBox(-0.5F, -0.7108F, -4.3533F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, 0.3077F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw3_r3 = lowerjaw1.addOrReplaceChild("lowerjaw3_r3", CubeListBuilder.create().texOffs(92, 17).addBox(-0.5F, 1.0374F, -2.395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0012F))
				.texOffs(92, 14).addBox(-0.5F, 0.3374F, -2.395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, -0.0588F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw1_r1 = lowerjaw1.addOrReplaceChild("lowerjaw1_r1", CubeListBuilder.create().texOffs(88, 46).addBox(-0.5F, 0.26F, -1.4857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5F, -0.26F, -0.0143F, -0.0064F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw2 = lowerjaw1.addOrReplaceChild("lowerjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.16F, -5.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition lowerjaw4_r6 = lowerjaw2.addOrReplaceChild("lowerjaw4_r6", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-0.5F, -2.2292F, -3.8546F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.42F, 5.3857F, 0.691F, -0.1438F, 0.0993F));

		PartDefinition lowerjaw6_r4 = lowerjaw2.addOrReplaceChild("lowerjaw6_r4", CubeListBuilder.create().texOffs(92, 33).mirror().addBox(-0.5F, -1.2249F, -9.1301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.42F, 5.3857F, 0.5688F, -0.1438F, 0.0993F));

		PartDefinition lowerjaw5_r6 = lowerjaw2.addOrReplaceChild("lowerjaw5_r6", CubeListBuilder.create().texOffs(92, 30).mirror().addBox(-0.5F, -0.2366F, -9.155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.42F, 5.3857F, 0.3506F, -0.1438F, 0.0993F));

		PartDefinition lowerjaw6_r5 = lowerjaw2.addOrReplaceChild("lowerjaw6_r5", CubeListBuilder.create().texOffs(92, 23).mirror().addBox(-0.5F, 0.5951F, -6.9881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.42F, 5.3857F, 0.3201F, -0.1438F, 0.0993F));

		PartDefinition lowerjaw5_r7 = lowerjaw2.addOrReplaceChild("lowerjaw5_r7", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(-0.5F, -0.8683F, -8.1663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(71, 70).mirror().addBox(-0.5F, -1.6683F, -8.1663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.42F, 5.3857F, 0.5252F, -0.1438F, 0.0993F));

		PartDefinition lowerjaw4_r7 = lowerjaw2.addOrReplaceChild("lowerjaw4_r7", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-0.5F, 3.9252F, -4.3869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.42F, 5.3857F, -0.3082F, -0.1438F, 0.0993F));

		PartDefinition lowerjaw3_r4 = lowerjaw2.addOrReplaceChild("lowerjaw3_r4", CubeListBuilder.create().texOffs(59, 62).mirror().addBox(-0.5F, -1.3421F, -6.2457F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.42F, 5.3857F, 0.4728F, -0.1438F, 0.0993F));

		PartDefinition lowerjaw3_r5 = lowerjaw2.addOrReplaceChild("lowerjaw3_r5", CubeListBuilder.create().texOffs(71, 66).addBox(-0.5F, 3.9252F, -4.3869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, -0.42F, 5.3857F, -0.3082F, 0.1438F, -0.0993F));

		PartDefinition lowerjaw5_r8 = lowerjaw2.addOrReplaceChild("lowerjaw5_r8", CubeListBuilder.create().texOffs(92, 23).addBox(-0.5F, 0.5951F, -6.9881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.42F, 5.3857F, 0.3201F, 0.1438F, -0.0993F));

		PartDefinition lowerjaw4_r8 = lowerjaw2.addOrReplaceChild("lowerjaw4_r8", CubeListBuilder.create().texOffs(70, 16).addBox(-0.5F, -0.8683F, -8.1663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(71, 70).addBox(-0.5F, -1.6683F, -8.1663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.42F, 5.3857F, 0.5252F, 0.1438F, -0.0993F));

		PartDefinition lowerjaw5_r9 = lowerjaw2.addOrReplaceChild("lowerjaw5_r9", CubeListBuilder.create().texOffs(92, 33).addBox(-0.5F, -1.2249F, -9.1301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.42F, 5.3857F, 0.5688F, 0.1438F, -0.0993F));

		PartDefinition lowerjaw4_r9 = lowerjaw2.addOrReplaceChild("lowerjaw4_r9", CubeListBuilder.create().texOffs(92, 30).addBox(-0.5F, -0.2366F, -9.155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -0.42F, 5.3857F, 0.3506F, 0.1438F, -0.0993F));

		PartDefinition lowerjaw3_r6 = lowerjaw2.addOrReplaceChild("lowerjaw3_r6", CubeListBuilder.create().texOffs(66, 42).addBox(-0.5F, -2.2292F, -3.8546F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.42F, 5.3857F, 0.691F, 0.1438F, -0.0993F));

		PartDefinition lowerjaw2_r3 = lowerjaw2.addOrReplaceChild("lowerjaw2_r3", CubeListBuilder.create().texOffs(59, 62).addBox(-0.5F, -1.3421F, -6.2457F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, -0.42F, 5.3857F, 0.4728F, 0.1438F, -0.0993F));

		PartDefinition lowerjaw3 = lowerjaw2.addOrReplaceChild("lowerjaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -4.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r180 = lowerjaw3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(54, 97).mirror().addBox(-0.4735F, 0.0439F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.445F, 2.433F, -0.1176F, -0.3362F, 0.1051F, 3.0452F));

		PartDefinition cube_r181 = lowerjaw3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(97, 38).mirror().addBox(-0.4913F, 0.9311F, -0.6781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.445F, 2.433F, -0.1176F, 0.1119F, 0.0608F, 3.0607F));

		PartDefinition cube_r182 = lowerjaw3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(97, 67).mirror().addBox(-0.4735F, 0.0367F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(97, 61).mirror().addBox(-0.4735F, -0.4633F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.445F, 2.433F, -0.1176F, -0.249F, 0.1051F, 3.0452F));

		PartDefinition cube_r183 = lowerjaw3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(97, 35).mirror().addBox(-0.4735F, -0.4905F, -0.2213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.445F, 2.433F, -0.1176F, -0.4235F, 0.1051F, 3.0452F));

		PartDefinition cube_r184 = lowerjaw3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.4882F, 0.4878F, -0.5303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.445F, 2.433F, -0.1176F, -0.019F, 0.0642F, 3.0634F));

		PartDefinition lowerjaw6_r6 = lowerjaw3.addOrReplaceChild("lowerjaw6_r6", CubeListBuilder.create().texOffs(49, 97).mirror().addBox(-0.5F, 1.9254F, -9.2713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(97, 48).mirror().addBox(-0.5F, 1.3254F, -9.3713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.52F, 9.6857F, 0.1681F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw5_r10 = lowerjaw3.addOrReplaceChild("lowerjaw5_r10", CubeListBuilder.create().texOffs(13, 97).mirror().addBox(-0.5F, 3.2398F, -10.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.52F, 9.6857F, -0.0501F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw4_r10 = lowerjaw3.addOrReplaceChild("lowerjaw4_r10", CubeListBuilder.create().texOffs(51, 94).mirror().addBox(-0.5F, 4.4634F, -9.0485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.52F, 9.6857F, -0.181F, -0.1533F, 0.0837F));

		PartDefinition lowerjaw5_r11 = lowerjaw3.addOrReplaceChild("lowerjaw5_r11", CubeListBuilder.create().texOffs(92, 39).addBox(-0.6F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1527F, 2.0345F, -0.3828F, -0.0501F, 0.0F, 0.0F));

		PartDefinition lowerjaw4_r11 = lowerjaw3.addOrReplaceChild("lowerjaw4_r11", CubeListBuilder.create().texOffs(13, 97).addBox(-0.5F, 3.2398F, -10.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.52F, 9.6857F, -0.0501F, 0.1533F, -0.0837F));

		PartDefinition cube_r185 = lowerjaw3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(97, 38).addBox(-0.5087F, 0.9311F, -0.6781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.445F, 2.433F, -0.1176F, 0.1119F, -0.0608F, -3.0607F));

		PartDefinition cube_r186 = lowerjaw3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5118F, 0.4878F, -0.5303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.445F, 2.433F, -0.1176F, -0.019F, -0.0642F, -3.0634F));

		PartDefinition cube_r187 = lowerjaw3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(54, 97).addBox(-0.5264F, 0.0439F, -0.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.445F, 2.433F, -0.1176F, -0.3362F, -0.1051F, -3.0452F));

		PartDefinition cube_r188 = lowerjaw3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(97, 35).addBox(-0.5264F, -0.4905F, -0.2213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.445F, 2.433F, -0.1176F, -0.4235F, -0.1051F, -3.0452F));

		PartDefinition cube_r189 = lowerjaw3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(97, 67).addBox(-0.5264F, 0.0367F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(97, 61).addBox(-0.5264F, -0.4633F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.445F, 2.433F, -0.1176F, -0.249F, -0.1051F, -3.0452F));

		PartDefinition lowerjaw5_r12 = lowerjaw3.addOrReplaceChild("lowerjaw5_r12", CubeListBuilder.create().texOffs(49, 97).addBox(-0.5F, 1.9254F, -9.2713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(97, 48).addBox(-0.5F, 1.3254F, -9.3713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.52F, 9.6857F, 0.1681F, 0.1533F, -0.0837F));

		PartDefinition lowerjaw3_r7 = lowerjaw3.addOrReplaceChild("lowerjaw3_r7", CubeListBuilder.create().texOffs(51, 94).addBox(-0.5F, 4.4634F, -9.0485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, -0.52F, 9.6857F, -0.181F, 0.1533F, -0.0837F));

		PartDefinition lowerjawslope = lowerjaw2.addOrReplaceChild("lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.9F, -0.3643F, 0.0F, 0.0F));

		PartDefinition lowerjawslope_r1 = lowerjawslope.addOrReplaceChild("lowerjawslope_r1", CubeListBuilder.create().texOffs(92, 36).mirror().addBox(-0.5F, 5.1881F, -6.5879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(51, 53).mirror().addBox(-0.5F, 5.1881F, -9.0879F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.52F, 9.2857F, -0.226F, -0.1696F, 0.0412F));

		PartDefinition lowerjawslope_r2 = lowerjawslope.addOrReplaceChild("lowerjawslope_r2", CubeListBuilder.create().texOffs(92, 36).addBox(-0.5F, 5.1881F, -6.5879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(51, 53).addBox(-0.5F, 5.1881F, -9.0879F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, -1.52F, 9.2857F, -0.226F, 0.1696F, -0.0412F));

		PartDefinition lowerjawteeth1 = lowerjaw2.addOrReplaceChild("lowerjawteeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -2.2F, -0.2793F, 0.0F, 0.0F));

		PartDefinition jawparting = lowerjaw1.addOrReplaceChild("jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -1.2F, -0.4554F, 0.0F, 0.0F));

		PartDefinition upperjaw1 = head.addOrReplaceChild("upperjaw1", CubeListBuilder.create().texOffs(45, 58).addBox(-1.0F, 0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 20).addBox(-1.5F, 0.4F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.9627F, -5.3899F, 0.1047F, 0.0F, 0.0F));

		PartDefinition upperjaw2_r1 = upperjaw1.addOrReplaceChild("upperjaw2_r1", CubeListBuilder.create().texOffs(45, 15).addBox(-2.5F, -2.0F, -1.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.2F, 1.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition upperjaw7_r1 = upperjaw1.addOrReplaceChild("upperjaw7_r1", CubeListBuilder.create().texOffs(0, 41).addBox(-2.5F, -1.9947F, 0.1634F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.3F, -3.1F, 0.2923F, 0.0F, 0.0F));

		PartDefinition upperjaw6_r1 = upperjaw1.addOrReplaceChild("upperjaw6_r1", CubeListBuilder.create().texOffs(18, 54).addBox(-2.5F, -1.9491F, -0.8178F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.5F, 4.1F, -4.1F, -0.1527F, 0.0F, 0.0F));

		PartDefinition upperjaw4_r1 = upperjaw1.addOrReplaceChild("upperjaw4_r1", CubeListBuilder.create().texOffs(9, 63).mirror().addBox(0.0F, -0.7511F, -2.2332F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3F, -0.7F, 0.4232F, -0.1571F, 0.0F));

		PartDefinition upperjaw4_r2 = upperjaw1.addOrReplaceChild("upperjaw4_r2", CubeListBuilder.create().texOffs(11, 46).mirror().addBox(0.0F, -1.9244F, -2.8659F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.3F, -0.7F, 0.2269F, -0.1571F, 0.0F));

		PartDefinition upperjaw6_r2 = upperjaw1.addOrReplaceChild("upperjaw6_r2", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.3F, -0.4F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 82).mirror().addBox(-0.3F, -0.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8962F, 3.9862F, -1.3157F, 0.5541F, -0.1571F, 0.0F));

		PartDefinition upperjaw6_r3 = upperjaw1.addOrReplaceChild("upperjaw6_r3", CubeListBuilder.create().texOffs(23, 98).mirror().addBox(0.0F, -0.3F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6402F, 4.1719F, -4.8498F, -0.0567F, -0.1571F, 0.0F));

		PartDefinition upperjaw5_r1 = upperjaw1.addOrReplaceChild("upperjaw5_r1", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-0.1103F, -2.9765F, -0.0958F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 4.4F, -3.125F, 0.1983F, 0.223F, 0.2223F));

		PartDefinition upperjaw6_r4 = upperjaw1.addOrReplaceChild("upperjaw6_r4", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(-0.0675F, -0.9873F, -0.9124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.475F, 4.4F, -3.2F, -0.3756F, -0.2507F, 0.2982F));

		PartDefinition cube_r190 = upperjaw1.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(94, 73).mirror().addBox(-0.301F, -0.4861F, -0.5681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(56, 94).mirror().addBox(-0.301F, 0.2139F, -0.5681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 4.3236F, -3.3594F, 0.0999F, 0.0721F, 0.1093F));

		PartDefinition cube_r191 = upperjaw1.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(80, 39).mirror().addBox(-0.3983F, 0.2367F, -0.2762F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.3236F, -3.3594F, 0.2346F, 0.0573F, 0.0305F));

		PartDefinition cube_r192 = upperjaw1.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(38, 79).mirror().addBox(-0.3983F, -0.4653F, -0.5451F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 5.3236F, -3.3594F, 0.3655F, 0.0573F, 0.0305F));

		PartDefinition cube_r193 = upperjaw1.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(69, 86).mirror().addBox(-0.301F, -0.3694F, -0.1613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 4.3236F, -3.3594F, -0.0746F, 0.0721F, 0.1093F));

		PartDefinition cube_r194 = upperjaw1.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(94, 73).addBox(-0.699F, -0.4861F, -0.5681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 94).addBox(-0.699F, 0.2139F, -0.5681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1F, 4.3236F, -3.3594F, 0.0999F, -0.0721F, -0.1093F));

		PartDefinition cube_r195 = upperjaw1.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(69, 86).addBox(-0.699F, -0.3694F, -0.1613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.1F, 4.3236F, -3.3594F, -0.0746F, -0.0721F, -0.1093F));

		PartDefinition cube_r196 = upperjaw1.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(38, 79).addBox(-0.6017F, -0.4653F, -0.5451F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.1F, 5.3236F, -3.3594F, 0.3655F, -0.0573F, -0.0305F));

		PartDefinition cube_r197 = upperjaw1.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(80, 39).addBox(-0.6017F, 0.2367F, -0.2762F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1F, 5.3236F, -3.3594F, 0.2346F, -0.0573F, -0.0305F));

		PartDefinition upperjaw5_r2 = upperjaw1.addOrReplaceChild("upperjaw5_r2", CubeListBuilder.create().texOffs(45, 55).addBox(-0.9325F, -0.9873F, -0.9124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.475F, 4.4F, -3.2F, -0.3756F, 0.2507F, -0.2982F));

		PartDefinition upperjaw4_r3 = upperjaw1.addOrReplaceChild("upperjaw4_r3", CubeListBuilder.create().texOffs(35, 73).addBox(-0.8897F, -2.9765F, -0.0958F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.45F, 4.4F, -3.125F, 0.1983F, -0.223F, -0.2223F));

		PartDefinition upperjaw5_r3 = upperjaw1.addOrReplaceChild("upperjaw5_r3", CubeListBuilder.create().texOffs(0, 98).addBox(0.3F, -0.4F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 82).addBox(0.3F, -0.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8962F, 3.9862F, -1.3157F, 0.5541F, 0.1571F, 0.0F));

		PartDefinition upperjaw6_r5 = upperjaw1.addOrReplaceChild("upperjaw6_r5", CubeListBuilder.create().texOffs(23, 63).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1466F, 4.3375F, -5.3432F, -0.2749F, 0.0F, 0.0F));

		PartDefinition upperjaw5_r4 = upperjaw1.addOrReplaceChild("upperjaw5_r4", CubeListBuilder.create().texOffs(23, 98).addBox(0.0F, -0.3F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6402F, 4.1719F, -4.8498F, -0.0567F, 0.1571F, 0.0F));

		PartDefinition upperjaw3_r1 = upperjaw1.addOrReplaceChild("upperjaw3_r1", CubeListBuilder.create().texOffs(9, 63).addBox(-1.0F, -0.7511F, -2.2332F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 2.3F, -0.7F, 0.4232F, 0.1571F, 0.0F));

		PartDefinition upperjaw4_r4 = upperjaw1.addOrReplaceChild("upperjaw4_r4", CubeListBuilder.create().texOffs(77, 21).addBox(-1.5F, 0.0466F, -0.9583F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -4.0F, 0.3142F, 0.0F, 0.0F));

		PartDefinition upperjaw4_r5 = upperjaw1.addOrReplaceChild("upperjaw4_r5", CubeListBuilder.create().texOffs(89, 27).addBox(-1.025F, 0.0053F, -0.9764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.675F, 0.4F, -2.95F, 0.2293F, 0.1445F, 0.0336F));

		PartDefinition upperjaw3_r2 = upperjaw1.addOrReplaceChild("upperjaw3_r2", CubeListBuilder.create().texOffs(89, 0).addBox(-1.0F, 0.0166F, -0.9777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.4F, -3.0F, 0.2269F, 0.0F, 0.0F));

		PartDefinition upperjaw4_r6 = upperjaw1.addOrReplaceChild("upperjaw4_r6", CubeListBuilder.create().texOffs(54, 25).addBox(-2.5F, 0.0872F, -1.8205F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.5F, 1.1F, -4.0F, 0.6196F, 0.0F, 0.0F));

		PartDefinition upperjaw3_r3 = upperjaw1.addOrReplaceChild("upperjaw3_r3", CubeListBuilder.create().texOffs(11, 46).addBox(-1.0F, -1.9244F, -2.8659F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.3F, -0.7F, 0.2269F, 0.1571F, 0.0F));

		PartDefinition upperjaw3_r4 = upperjaw1.addOrReplaceChild("upperjaw3_r4", CubeListBuilder.create().texOffs(69, 50).addBox(-1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, 0.1F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition upperjaw2_r2 = upperjaw1.addOrReplaceChild("upperjaw2_r2", CubeListBuilder.create().texOffs(69, 46).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1F, -1.0F, 0.1595F, 0.1724F, 0.0276F));

		PartDefinition upperjaw2 = upperjaw1.addOrReplaceChild("upperjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -6.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition upperjaw5_r5 = upperjaw2.addOrReplaceChild("upperjaw5_r5", CubeListBuilder.create().texOffs(18, 59).addBox(-2.0F, -1.5243F, 0.0173F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(78, 66).addBox(-2.0F, -1.0243F, 0.0173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -0.2469F, 0.1003F, 0.2618F, 0.0F, 0.0F));

		PartDefinition upperjaw3_r5 = upperjaw2.addOrReplaceChild("upperjaw3_r5", CubeListBuilder.create().texOffs(78, 52).addBox(-2.0F, 0.25F, -0.875F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -1.3469F, 1.2003F, -0.1745F, 0.0F, 0.0F));

		PartDefinition upperjaw2_r3 = upperjaw2.addOrReplaceChild("upperjaw2_r3", CubeListBuilder.create().texOffs(82, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.6F, 0.48F, 0.0F, 0.0F));

		PartDefinition nose = upperjaw2.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition nose_r1 = nose.addOrReplaceChild("nose_r1", CubeListBuilder.create().texOffs(31, 91).addBox(-0.5F, -0.35F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.3F, 0.829F, 0.0F, 0.0F));

		PartDefinition nose_r2 = nose.addOrReplaceChild("nose_r2", CubeListBuilder.create().texOffs(58, 88).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.04F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7066F, 1.7331F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperjawteeth = upperjaw2.addOrReplaceChild("upperjawteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.8F, 0.0785F, 0.0F, 0.0F));

		PartDefinition upperjawteeth1 = upperjaw1.addOrReplaceChild("upperjawteeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, -2.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftsabre = upperjaw1.addOrReplaceChild("leftsabre", CubeListBuilder.create(), PartPose.offset(1.9F, 4.0F, -5.03F));

		PartDefinition rightsabre = upperjaw1.addOrReplaceChild("rightsabre", CubeListBuilder.create(), PartPose.offset(-1.9F, 4.0F, -5.03F));

		PartDefinition fur1 = body.addOrReplaceChild("fur1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0687F, -18.2658F, 0.4098F, 0.0F, 0.0F));

		PartDefinition fur2 = fur1.addOrReplaceChild("fur2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, 0.182F, 0.0F, 0.0F));

		PartDefinition fur3 = fur2.addOrReplaceChild("fur3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -1.9F, 0.182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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