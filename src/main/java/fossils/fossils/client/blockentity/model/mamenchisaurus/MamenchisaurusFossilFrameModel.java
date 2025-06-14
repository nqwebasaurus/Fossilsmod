package fossils.fossils.client.blockentity.model.mamenchisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MamenchisaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart TailClub;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart ForeHead;
	private final ModelPart ForeHead2;
	private final ModelPart Snout;
	private final ModelPart Snout2;
	private final ModelPart Snout3;
	private final ModelPart Nose;
	private final ModelPart Nose2;
	private final ModelPart jaw;
	private final ModelPart Jaw2;
	private final ModelPart Jaw3;

	public MamenchisaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.leftLeg = this.root.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg = this.root.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.hips = this.root.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.TailClub = this.tail7.getChild("TailClub");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm3 = this.leftArm.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightArm3 = this.leftArm.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.ForeHead = this.head.getChild("ForeHead");
		this.ForeHead2 = this.ForeHead.getChild("ForeHead2");
		this.Snout = this.head.getChild("Snout");
		this.Snout2 = this.Snout.getChild("Snout2");
		this.Snout3 = this.Snout2.getChild("Snout3");
		this.Nose = this.Snout2.getChild("Nose");
		this.Nose2 = this.Nose.getChild("Nose2");
		this.jaw = this.head.getChild("jaw");
		this.Jaw2 = this.jaw.getChild("Jaw2");
		this.Jaw3 = this.Jaw2.getChild("Jaw3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -46.0F, -18.6F, 2.0F, 46.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 0).addBox(-1.0F, -33.0F, 12.2F, 2.0F, 33.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(2.6F, -7.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -27.0F, 13.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.3F, -11.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -27.0F, -17.6F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -30.5F, 17.0F));

		PartDefinition leftLeg = root.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, 0.0F, -2.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.4F, -2.9F, 0.288F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 11.0505F, 1.626F, 0.0262F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5183F, -4.6842F));

		PartDefinition rightLeg = root.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offset(-7.0F, 0.0F, -2.5F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.4F, -2.9F, 0.5061F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 11.0505F, 1.626F, -0.4538F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5183F, -4.6842F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -4.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(67, -1).addBox(-1.5F, 1.3F, -7.9F, 3.0F, 3.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1245F, 0.4815F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, 7.3F, -0.0437F, 0.0436F, -0.0019F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(81, 75).addBox(-1.5F, -1.1365F, -1.1428F, 3.0F, 2.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.448F, 0.3592F, 0.1222F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9382F, 13.1359F, -0.2233F, 0.2129F, -0.0479F));

		PartDefinition cube_r5 = tail2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 77).addBox(-1.5F, 2.9F, -0.1F, 3.0F, 2.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.2473F, -0.3617F, 0.1571F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9019F, 12.5549F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r6 = tail3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 72).addBox(-1.0F, 2.1F, -1.1F, 2.0F, 2.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6135F, -0.0637F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0959F, 13.7468F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition cube_r7 = tail4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 48).addBox(-1.175F, 0.6F, -1.2F, 2.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0834F, 0.0485F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2358F, 13.8701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r8 = tail5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 19).addBox(-0.5F, 0.6F, -1.1F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0976F, -0.0216F, 0.0698F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8882F, 12.7096F, 0.0962F, -0.4346F, -0.0406F));

		PartDefinition cube_r9 = tail6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5F, 0.6F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0513F, 0.2081F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.694F, 12.0914F, -0.257F, -0.5522F, 0.137F));

		PartDefinition cube_r10 = tail7.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.6F, -0.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 0.0021F, 0.0698F, 0.0F, 0.0F));

		PartDefinition TailClub = tail7.addOrReplaceChild("TailClub", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5581F, 10.9311F, 0.0F, -0.4363F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 45).addBox(-1.5F, 2.5455F, -1.0348F, 3.0F, 3.0F, 19.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.3401F, -17.4698F, -0.2182F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.6019F, -17.504F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 69).addBox(-1.5F, 2.5639F, -0.3668F, 3.0F, 3.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.2292F, -13.14F, -0.3229F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.75F, 18.2208F, -6.24F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.25F, 1.748F, -0.353F, 2.0809F, -0.0304F, 0.0123F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.5276F, -11.5544F, -0.9163F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -3.5961F, -9.1411F, 0.4014F, 0.0F, 0.0F));

		PartDefinition rightArm3 = leftArm.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-18.75F, 1.748F, -0.353F, 1.6842F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.5276F, -11.5544F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.5961F, -9.1411F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.1292F, -13.24F, -0.394F, -0.0806F, 0.0335F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, 2.9F, 0.0F, 3.0F, 3.0F, 23.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.354F, -22.7351F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.654F, -22.4351F, 0.0312F, -0.1274F, -0.3069F));

		PartDefinition cube_r14 = neck2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-3, -3).addBox(-1.6F, 2.175F, -1.0F, 3.0F, 3.0F, 27.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.7261F, -24.8296F, -0.0349F, -0.0174F, 0.0006F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 56).addBox(-1.5F, 2.4F, -16.9F, 3.0F, 3.0F, 17.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.6261F, -24.8296F, -0.073F, -0.1809F, -0.073F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -17.0F, 0.2793F, -0.1675F, -0.1402F));

		PartDefinition cube_r15 = neck4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(61, 53).addBox(-1.5F, -2.0547F, -15.9321F, 3.0F, 3.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.3643F, -0.4681F, -0.2269F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4656F, -15.373F, 0.1683F, -0.1721F, -0.0291F));

		PartDefinition cube_r16 = neck5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(67, 31).addBox(-1.0F, 1.8F, -0.3F, 2.0F, 2.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.1477F, -15.4585F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1477F, -15.7585F, 0.1683F, -0.1721F, -0.0291F));

		PartDefinition cube_r17 = neck6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 88).addBox(-1.0F, 1.7F, 0.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.7178F, -12.224F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1178F, -11.824F, 0.0886F, -0.1739F, -0.0154F));

		PartDefinition cube_r18 = neck7.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, 1.8F, 0.275F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.3092F, -9.0362F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1592F, -8.7362F, 0.2212F, -0.2608F, -0.0233F));

		PartDefinition cube_r19 = neck8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(123, 96).addBox(-1.0F, 0.9F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0128F, -2.0038F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0628F, -3.6038F, 0.6981F, 0.0F, 0.0F));

		PartDefinition ForeHead = head.addOrReplaceChild("ForeHead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition ForeHead2 = ForeHead.addOrReplaceChild("ForeHead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Snout = head.addOrReplaceChild("Snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Snout2 = Snout.addOrReplaceChild("Snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Snout3 = Snout2.addOrReplaceChild("Snout3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.15F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Nose = Snout2.addOrReplaceChild("Nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Nose2 = Nose.addOrReplaceChild("Nose2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.9861F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -1.6F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Jaw2 = jaw.addOrReplaceChild("Jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1506F, -1.7219F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Jaw3 = Jaw2.addOrReplaceChild("Jaw3", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.95F));

		return LayerDefinition.create(meshdefinition, 167, 167);
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